package es.ieslavereda.model;

public final class BlackPawn extends Pawn{
    public BlackPawn(Cell cell) {
        super(PieceType.BLACK_PAWN, cell);
    }

//    @Override
//    public void moveTo(Coordinate c){
//        super.moveTo(c);
//        if(getCell().getCoordinate().getRow()==8){
//            new BlackQueen(getCell());
//        }
//    }

    @Override
    public Coordinate[] getNextMovements() {
        return new Coordinate[0];
    }

    @Override
    public void transform() {
        new BlackQueen(getCell());
        cell=null;
    }
}
