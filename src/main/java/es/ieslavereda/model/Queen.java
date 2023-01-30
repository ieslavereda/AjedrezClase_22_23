package es.ieslavereda.model;

import es.ieslavereda.Tool;
import es.ieslavereda.tad.Lista;

public abstract class Queen extends Piece {

    public Queen(PieceType pieceType,Cell cell){
        super(pieceType,cell);
    }

    @Override
    public Lista getNextMovements() {
       return Rook.getNextMovementsAsRook(this).
               addAll(Bishop.getNextMovementsAsBishop(this));
    }
}
