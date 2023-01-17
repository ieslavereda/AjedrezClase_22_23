package es.ieslavereda.model;

public class Board {

    private Cell[][] cells;

    public Board() {
        cells = new Cell[8][8];

        for (int row = 0; row <= 7; row++)
            for (int col = 0; col <= 7; col++) {
                cells[row][col] = new Cell(new Coordinate((char) ('A' + col), row + 1), this);
            }

    }

    public void placePieces() {
        new WhiteKnight(getCell(new Coordinate('B', 8)));
        new WhiteKnight(getCell(new Coordinate('C', 6)));
        new BlackKnight(getCell(new Coordinate('E', 5)));
        new BlackQueen(getCell(new Coordinate('B', 2)));
    }

    public Cell getCell(Coordinate coordinate) {

        if (coordinate.getRow() < 1 || coordinate.getRow() > 8)
            return null;
        if (coordinate.getColumn() < 'A' || coordinate.getColumn() > 'H')
            return null;

        return cells[coordinate.getRow() - 1][coordinate.getColumn() - 'A'];
    }

    public void highlight(Coordinate[] coordinates) {
        for (Coordinate c : coordinates)
            getCell(c).highlight();
    }

    public void resetColors() {
        for (Cell[] row : cells)
            for (Cell c : row)
                c.resetColor();
    }

    @Override
    public String toString() {
        String output = "   A  B  C  D  E  F  G  H\n";
        for (int row = 0; row <= 7; row++) {
            output += (row + 1) + " ";
            for (int col = 0; col <= 7; col++)
                output += cells[row][col];
            output += " " + (row + 1) + "\n";
        }
        output += "   A  B  C  D  E  F  G  H";
        return output;
    }
}
