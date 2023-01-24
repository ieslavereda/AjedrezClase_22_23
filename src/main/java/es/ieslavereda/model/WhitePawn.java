package es.ieslavereda.model;

public class WhitePawn extends Pawn{

    public WhitePawn(Cell cell) {
        super(PieceType.WHITE_PAWN, cell);
    }

    @Override
    public void transform() {
        new WhiteQueen(getCell());
        cell=null;
    }

    @Override
    public Coordinate[] getNextMovements() {
        return new Coordinate[0];
    }
}
