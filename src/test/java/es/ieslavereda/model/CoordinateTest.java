package es.ieslavereda.model;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {

    @Test
    @DisplayName("Testing new coordinate in the up direction.")
    void up() {
        Coordinate c1 = new Coordinate('C',5);
        Coordinate c2 = new Coordinate('C',4);

        assertEquals(c1.up(),c2);
    }

    @Test
    @DisplayName("Testing new coordinate in the down direction.")
    void down() {
        assertEquals(new Coordinate('C',2).down(),new Coordinate('C',3));
        assertEquals(new Coordinate('e',1).down(),new Coordinate('E',2));
        assertEquals(new Coordinate('G',2).down(),new Coordinate('g',3));
        assertEquals(new Coordinate('A',4).down(),new Coordinate('A',5));
        assertEquals(new Coordinate('E',5).down(),new Coordinate('E',6));
    }

    @Test
    @DisplayName("Testing new coordinate in the left direction.")
    void left() {
        assertEquals(new Coordinate('C',2).left(),new Coordinate('b',2));
        assertEquals(new Coordinate('e',1).left(),new Coordinate('d',1));
        assertEquals(new Coordinate('G',2).left(),new Coordinate('F',2));
        assertEquals(new Coordinate('B',4).left(),new Coordinate('A',4));
        assertEquals(new Coordinate('E',5).left(),new Coordinate('D',5));
    }

    @Test
    @Disabled
    void right() {
        assertEquals(new Coordinate('C',2).right(),new Coordinate('d',2));
        assertEquals(new Coordinate('e',1).right(),new Coordinate('f',1));
        assertEquals(new Coordinate('G',2).right(),new Coordinate('H',2));
        assertEquals(new Coordinate('A',4).right(),new Coordinate('B',4));
        assertEquals(new Coordinate('E',5).right(),new Coordinate('F',5));
    }

    @Test
    @Disabled
    void upRight() {
    }

    @Test
    @Disabled
    void upLeft() {
    }

    @Test
    @Disabled
    void downRight() {
    }

    @Test
    void downLeft() {
    }

    @Test
    @DisplayName("Testing equals method.")
    void testEquals(){
        assertEquals(new Coordinate('C',2),new Coordinate('C',2));
        assertEquals(new Coordinate('e',1),new Coordinate('E',1));
        assertEquals(new Coordinate('G',2),new Coordinate('g',2));
        assertEquals(new Coordinate('A',4),new Coordinate('A',4));
        assertEquals(new Coordinate('E',5),new Coordinate('E',5));
    }
}