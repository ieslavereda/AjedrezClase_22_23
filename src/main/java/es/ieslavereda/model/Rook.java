package es.ieslavereda.model;

import es.ieslavereda.Tool;

public abstract  class Rook extends Piece {

    public Rook(PieceType pieceType, Cell cell) {
        super(pieceType, cell);
    }

    public static Coordinate[] getNextMovementsAsRook(Piece p) {
        Coordinate[] coordinates = new Coordinate[0];
        Cell cell = p.getCell();
        Board board = cell.getBoard();
        Color color = p.getColor();

        Coordinate original = cell.getCoordinate();
        Coordinate c;

        // UP
        c=original.up();
        while (board.getCell(c)!=null && board.getCell(c).isEmpty()) {
            coordinates = Tool.add(coordinates, c);
            c=c.up();
        }
        if(board.getCell(c)!=null && board.getCell(c).getPiece().getColor()!=color)
            coordinates = Tool.add(coordinates,c);

        // DOWN
        c=original.down();
        while (board.getCell(c)!=null && board.getCell(c).isEmpty()) {
            coordinates = Tool.add(coordinates, c);
            c=c.down();
        }
        if(board.getCell(c)!=null && board.getCell(c).getPiece().getColor()!=color)
            coordinates = Tool.add(coordinates,c);

        // LEFT
        c=original.left();
        while (board.getCell(c)!=null && board.getCell(c).isEmpty()) {
            coordinates = Tool.add(coordinates, c);
            c=c.left();
        }
        if(board.getCell(c)!=null && board.getCell(c).getPiece().getColor()!=color)
            coordinates = Tool.add(coordinates,c);

        // RIGHT
        c=original.right();
        while (board.getCell(c)!=null && board.getCell(c).isEmpty()) {
            coordinates = Tool.add(coordinates, c);
            c=c.right();
        }
        if(board.getCell(c)!=null && board.getCell(c).getPiece().getColor()!=color)
            coordinates = Tool.add(coordinates,c);


        return coordinates;
    }

    @Override
    public Coordinate[] getNextMovements() {
        return Rook.getNextMovementsAsRook(this);
    }


}
