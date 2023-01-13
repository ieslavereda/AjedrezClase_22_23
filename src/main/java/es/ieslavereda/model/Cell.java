package es.ieslavereda.model;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Cell {
    private Piece piece;
    private Color color;
    private Color original;
    private Coordinate coordinate;
    private Board board;

    public Cell(Coordinate coordinate, Board board) {
        this.coordinate = coordinate;
        this.board = board;
        this.piece = null;
        this.original = (
                (coordinate.getRow()-1+coordinate.getColumn()-'A')%2==0)
                ?
                Color.WHITE_CELL
                :
                Color.BLACK_CELL;
        this.color = original;
    }

    public Color getColor() {
        return color;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    public void highlight(){
        if(isEmpty()){
            color = (original==Color.WHITE_CELL)
                    ?
                    Color.HIGHLIGHT_WHITE
                    :
                    Color.HIGHLIGHT_BLACK;
        } else {
            color = (original==Color.WHITE_CELL)
                    ?
                    Color.HIGHLIGHT_KILL_WHITE
                    :
                    Color.HIGHLIGHT_KILL_BLACK;
        }
    }

    public void resetColor(){
        color=original;
    }
    @Override
    public String toString(){
        if(isEmpty())
            return colorize("   ",color.getAttribute());
        else
            return colorize(" ",color.getAttribute()) +
                    piece +
                    colorize(" ",color.getAttribute());

    }

    private boolean isEmpty() {
        return piece == null;
    }

    enum Color{
        WHITE_CELL(Attribute.BACK_COLOR(180,180,180)),
        BLACK_CELL(Attribute.BACK_COLOR(100,100,100)),
        HIGHLIGHT_KILL_WHITE(Attribute.BACK_COLOR(180,0,0)),
        HIGHLIGHT_KILL_BLACK(Attribute.BACK_COLOR(130,0,0)),
        HIGHLIGHT_WHITE(Attribute.BACK_COLOR(180,180,0)),
        HIGHLIGHT_BLACK(Attribute.BACK_COLOR(130,130,0));

        private Attribute attribute;

        Color(Attribute attribute){
            this.attribute = attribute;
        }

        public Attribute getAttribute() {
            return attribute;
        }
    }
}


