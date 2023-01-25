package es.ieslavereda;

import es.ieslavereda.model.*;

public class Main {
    public static void main(String[] args) {

        Board b = new Board();

        b.placePieces();
        System.out.println(b);


        b.highlight(b.getCell(new Coordinate('G',8)).getPiece().getNextMovements());

        System.out.println(b);
        b.resetColors();




    }
}