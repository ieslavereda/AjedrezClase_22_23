package es.ieslavereda.model;

public abstract class King extends Piece{

    private boolean moved;

    public King(PieceType shape, Cell cell) {
        super(shape, cell);
        moved=false;
    }

    public boolean isMoved() {
        return moved;
    }

    @Override
    public Coordinate[] getNextMovements() {
        return new Coordinate[0];
    }
}
