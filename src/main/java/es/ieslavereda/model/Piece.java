package es.ieslavereda.model;

import static com.diogonunes.jcolor.Ansi.colorize;

public abstract class Piece {

    private PieceType shape;
    private Cell cell;

    public Piece(PieceType shape,Cell cell){
        this.shape = shape;
        this.cell=cell;
        putInYourPlace();
    }

    public Cell getCell() {
        return cell;
    }
    public Color getColor(){
        return shape.color;
    }

    public void putInYourPlace(){
        cell.setPiece(this);
    }

    @Override
    public String toString(){
        return colorize(shape.toString(),shape.color.getAttribute(),cell.getColor().getAttribute());
    }

    public abstract Coordinate[] getNextMovements();

    public enum PieceType {

        BLACK_KING('♚',Color.BLACK),
        BLACK_QUEEN('♛',Color.BLACK),
        BLACK_ROOK('♜',Color.BLACK),
        BLACK_BISHOP('♝',Color.BLACK),
        BLACK_KNIGHT('♞',Color.BLACK),
        BLACK_PAWN('♟',Color.BLACK),
        WHITE_KING('♚',Color.WHITE),
        WHITE_QUEEN('♛',Color.WHITE),
        WHITE_ROOK('♜',Color.WHITE),
        WHITE_BISHOP('♝',Color.WHITE),
        WHITE_KNIGHT('♞',Color.WHITE),
        WHITE_PAWN('♟',Color.WHITE);
        private char shape;
        private Color color;
        PieceType(char shape,Color color){
            this.shape = shape;
            this.color = color;
        }

        public char getShape() {
            return shape;
        }

        @Override
        public String toString() {
            return  String.valueOf(shape);
        }
    }
}
