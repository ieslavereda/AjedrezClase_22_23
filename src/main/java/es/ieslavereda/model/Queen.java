package es.ieslavereda.model;

import es.ieslavereda.Tool;

public abstract class Queen extends Piece {

    public Queen(PieceType pieceType,Cell cell){
        super(pieceType,cell);
    }

    @Override
    public Coordinate[] getNextMovements() {

        Coordinate[] rookMovements = Rook.getNextMovementsAsRook(this);
        Coordinate[] bishopMovements = Bishop.getNextMovementsAsBishop(this);

        return Tool.merge(rookMovements,bishopMovements);
    }
}
