package es.ieslavereda;

import es.ieslavereda.model.Coordinate;

public class Tool {
    public static Coordinate[] add(Coordinate[] coordinates, Coordinate coordinate){
        Coordinate[] aux = new Coordinate[coordinates.length+1];
        for(int i=0;i< coordinates.length;i++)
            aux[i]=coordinates[i];

        aux[aux.length-1]=coordinate;
        return aux;
    }
}
