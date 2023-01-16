package es.ieslavereda;

import es.ieslavereda.model.*;

public class Main {
    public static void main(String[] args) {

        Board b = new Board();

        b.placePieces();

        Coordinate[] coordinates = b.getCell(new Coordinate('B',8)).getPiece().getNextMovements();


        System.out.println(b);
        for(Coordinate c : coordinates )
            System.out.print(c+" ");

    }
}