package es.ieslavereda.tad;

import es.ieslavereda.model.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ListaDETest {

    private static Board board;

    @BeforeAll
    public static void init(){
        board = new Board();
    }

    @Test
    void addHead() {
        ListaDE lista = new ListaDE();
        lista.addHead(new WhiteQueen(new Cell(new Coordinate('a',2),board)));
        lista.addHead(new BlackQueen(new Cell(new Coordinate('a',2),board)));
        lista.addHead(new BlackRook(new Cell(new Coordinate('a',2),board)));
        lista.addHead(new WhiteRook(new Cell(new Coordinate('a',2),board)));

        assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                System.out.println(lista);
                System.out.println(lista.toStringReverse());
            }
        });

    }

    @Test
    void addTail() {
        ListaDE lista = new ListaDE();
        lista.addTail(new WhiteQueen(new Cell(new Coordinate('a',2),board)));
        lista.addTail(new BlackQueen(new Cell(new Coordinate('a',2),board)));
        lista.addTail(new BlackRook(new Cell(new Coordinate('a',2),board)));
        lista.addTail(new WhiteRook(new Cell(new Coordinate('a',2),board)));

        assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                System.out.println(lista);
                System.out.println(lista.toStringReverse());
            }
        });
    }
}