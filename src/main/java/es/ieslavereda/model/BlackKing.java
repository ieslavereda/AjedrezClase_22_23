package es.ieslavereda.model;

public final class BlackKing extends King{
    public BlackKing(Cell cell) {
        super(PieceType.BLACK_KING, cell);
    }

    @Override
    public Coordinate[] getNextMovements() {
        return new Coordinate[0];
    }
}
