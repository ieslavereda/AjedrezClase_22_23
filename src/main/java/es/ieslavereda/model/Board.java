package es.ieslavereda.model;

public class Board {

    private Cell[][] cells ;

    public Board(){
        cells = new Cell[8][8];

        for(int row=0;row<=7;row++)
            for(int col=0;col<=7;col++){
                cells[row][col]=new Cell(new Coordinate((char)('A'+col),row+1),this);
            }

    }

    @Override
    public String toString(){
        String output ="   A  B  C  D  E  F  G  H\n";
        for(int row=0;row<=7;row++) {
            output+=(row+1)+" ";
            for (int col = 0; col <= 7; col++)
               output += cells[row][col];
            output+=" "+(row+1)+"\n";
        }
        output +="   A  B  C  D  E  F  G  H";
        return output;
    }
}
