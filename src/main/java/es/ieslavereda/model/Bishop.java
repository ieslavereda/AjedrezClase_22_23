package es.ieslavereda.model;

import es.ieslavereda.Tool;

public abstract class Bishop extends Piece{

    public Bishop(PieceType pieceType,Cell cell){
        super(pieceType,cell);
    }

    public static Coordinate[] getNextMovementsAsBishop(Piece p) {
        Coordinate[] coordinates = new Coordinate[0];
        Cell cell = p.getCell();
        Board board = cell.getBoard();
        Color color = p.getColor();

        Coordinate original = cell.getCoordinate();
        Coordinate c;

        // UP-LEFT
        c=original.upLeft();
        while (board.getCell(c)!=null && board.getCell(c).isEmpty()) {
            coordinates = Tool.add(coordinates, c);
            c=c.upLeft();
        }
        if(board.getCell(c)!=null && board.getCell(c).getPiece().getColor()!=color)
            coordinates = Tool.add(coordinates,c);

        // UP-RIGHT
        c=original.upRight();
        while (board.getCell(c)!=null && board.getCell(c).isEmpty()) {
            coordinates = Tool.add(coordinates, c);
            c=c.upRight();
        }
        if(board.getCell(c)!=null && board.getCell(c).getPiece().getColor()!=color)
            coordinates = Tool.add(coordinates,c);

        // DOWN-RIGHT
        c=original.downRight();
        while (board.getCell(c)!=null && board.getCell(c).isEmpty()) {
            coordinates = Tool.add(coordinates, c);
            c=c.downRight();
        }
        if(board.getCell(c)!=null && board.getCell(c).getPiece().getColor()!=color)
            coordinates = Tool.add(coordinates,c);

        // DOWN-LEFT
        c=original.downLeft();
        while (board.getCell(c)!=null && board.getCell(c).isEmpty()) {
            coordinates = Tool.add(coordinates, c);
            c=c.downLeft();
        }
        if(board.getCell(c)!=null && board.getCell(c).getPiece().getColor()!=color)
            coordinates = Tool.add(coordinates,c);

        return coordinates;
    }

    @Override
    public Coordinate[] getNextMovements() {
        return getNextMovementsAsBishop(this);
    }
}
