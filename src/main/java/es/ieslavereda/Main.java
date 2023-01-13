package es.ieslavereda;

import es.ieslavereda.model.Color;
import es.ieslavereda.model.Piece;

public class Main {
    public static void main(String[] args) {

        for(Piece.PieceType pieceType : Piece.PieceType.values())
            System.out.println(new Piece(pieceType));



    }
}