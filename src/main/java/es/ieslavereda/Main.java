package es.ieslavereda;

import es.ieslavereda.model.*;

public class Main {
    public static void main(String[] args) {

        Board b = new Board();

        b.placePieces();

        b.getCell(new Coordinate('D',7)).getPiece().moveTo(new Coordinate('D',8));

//        Coordinate[] coordinates = b.getCell(new Coordinate('B',2)).getPiece().getNextMovements();
//        b.highlight(coordinates);
//
//        System.out.println(b);
//        b.resetColors();
        System.out.println(b);



    }
}