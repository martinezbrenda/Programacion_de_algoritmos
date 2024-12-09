package Practica.Practica.PrograDinamica;

public class PuntosTablero {
    public int maximaPuntuacion(int[][]tablero){
        int filas = tablero.length;
        int columnas = tablero[0].length;
        int [][] maximosPuntos = new int[filas][columnas];

        //falta verificaciones seguramente
        if(filas == 1 && columnas == 1) {
            return tablero[0][0];
        }
        maximosPuntos[0][0] = tablero[0][0];
        maximosPuntos[0][1] = maximosPuntos[0][0] + tablero[0][1];
        maximosPuntos[1][0] = maximosPuntos[0][0] + tablero[1][0];
        for (int f = 1; f < filas; f++) {
            for (int c = 1; c < columnas; c++) {
                maximosPuntos[f][c] = tablero[f][c] + Math.max( maximosPuntos[f][c-1], maximosPuntos[f-1][c]);
            }
        }
        return maximosPuntos[filas-1][columnas-1];

    }
}
