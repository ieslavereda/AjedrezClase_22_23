package es.ieslavereda;

import es.ieslavereda.model.*;

public class Main {
    public static void main(String[] args) {

        Board b = new Board();

        b.placePieces();

        Coordinate[] coordinates = b.getCell(new Coordinate('B',2)).getPiece().getNextMovements();
        b.highlight(coordinates);

        System.out.println(b);
        b.resetColors();
        System.out.println(b);



    }
}