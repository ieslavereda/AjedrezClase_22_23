package es.ieslavereda.model;

import com.diogonunes.jcolor.Attribute;

public class Cell {
    private Piece piece;
    private Color color;
    private Color original;
    private Coordinate coordinate;
    private Board board;

    public Cell(Coordinate coordinate, Board board) {
        this.coordinate = coordinate;
        this.board = board;
    }

    private enum Color{
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


