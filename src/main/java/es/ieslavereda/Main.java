package es.ieslavereda;

import es.ieslavereda.model.*;

public class Main {
    public static void main(String[] args) {

        Board b = new Board();

        b.placePieces();
        System.out.println(b);
        b.getCell(new Coordinate('D',7)).getPiece().moveTo(new Coordinate('D',8));
        System.out.println(b);
//        Coordinate[] coordinates = b.getCell(new Coordinate('B',2)).getPiece().getNextMovements();
//        b.highlight(coordinates);
//
//        System.out.println(b);
//        b.resetColors();




    }
}