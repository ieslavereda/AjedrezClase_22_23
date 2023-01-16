package es.ieslavereda.model;

public abstract class Knight extends Piece{
    public Knight(PieceType pieceType,Cell cell){
        super(pieceType,cell);
    }

    @Override
    public Coordinate[] getNextMovements() {
        Coordinate[] coordinates = new Coordinate[0];
        Board board = getCell().getBoard();
        Coordinate position = getCell().getCoordinate();



        return new Coordinate[0];
    }
}
