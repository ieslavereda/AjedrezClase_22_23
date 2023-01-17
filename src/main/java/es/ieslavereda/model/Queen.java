package es.ieslavereda.model;

import es.ieslavereda.Tool;

public abstract class Queen extends Piece {

    public Queen(PieceType pieceType,Cell cell){
        super(pieceType,cell);
    }

    @Override
    public Coordinate[] getNextMovements() {

        Coordinate[] coordinates1 = Rook.getNextMovementsAsRook(this);
        Coordinate[] coordinates2 = Bishop.getNextMovementsAsBishop(this);

        return Tool.merge(coordinates1,coordinates2);
    }
}
