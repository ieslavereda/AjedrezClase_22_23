package es.ieslavereda.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {

    @Test
    void getColor() {
        Board b = new Board();
        Cell c1 = new Cell(new Coordinate('A',1),b);
        Cell c2 = new Cell(new Coordinate('G',6),b);
        assertEquals(c1.getColor(), Cell.Color.WHITE_CELL);
        assertEquals(c2.getColor(), Cell.Color.BLACK_CELL);
    }
}