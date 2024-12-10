package Practica.Practica.PrograDinamica;

public class MinaDeOro {
    private void copiar(int[] original, int[] copia) {
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }
        for (int i = 0; i < original.length; i++) {
            System.out.printf("elemento %d\n", copia[i]);
        }
    }

    private int mayor(int[] a) {
        int mayor = a[0];
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] > mayor)
                mayor = a[i];
        }
        return mayor;
    }

    public int cavar(int[][] mina) {
        int filas = mina.length;
        int columnas = mina[0].length;
        int[][] tabulacion = new int[filas][columnas];
        int f = 0, c = 0;

        copiar(mina[0], tabulacion[0]);

        for (f = 1; f < filas; f++) {
            for (c = 0; c < columnas; c++) {
                if (c == 0) {
                    System.out.printf("Comparo para la posicion [%d,%d] --> %d + %d o %d + %d\n", f, c, mina[f][c], tabulacion[f - 1][c], mina[f][c], tabulacion[f - 1][c + 1]);
                    tabulacion[f][c] = Math.max(mina[f][c] + tabulacion[f - 1][c], mina[f][c] + tabulacion[f - 1][c + 1]);
                    System.out.printf("Agrego en la posicion [%d,%d] el valor %d\n", f, c, tabulacion[f][c]);
                } else if (c == columnas - 1) {
                    System.out.printf("Comparo para la posicion [%d,%d] --> %d + %d o %d + %d\n", f, c, mina[f][c], tabulacion[f - 1][c], mina[f][c], tabulacion[f - 1][c - 1]);
                    tabulacion[f][c] = Math.max(tabulacion[f - 1][c] + mina[f][c], tabulacion[f - 1][c - 1] + mina[f][c]);
                    System.out.printf("Agrego en la posicion [%d,%d] el valor %d\n", f, c, tabulacion[f][c]);
                } else {
                    System.out.printf("Comparo para la posicion [%d,%d] --> %d + %d o %d + %d o %d + %d\n", f, c, mina[f][c], tabulacion[f - 1][c - 1], mina[f][c], tabulacion[f - 1][c], mina[f][c], mina[f - 1][c + 1]);
                    tabulacion[f][c] = Math.max(Math.max(tabulacion[f - 1][c - 1] + mina[f][c], tabulacion[f - 1][c] + mina[f][c]), tabulacion[f - 1][c + 1] + mina[f][c]);
                    System.out.printf("Agrego en la posicion [%d,%d] el valor %d\n", f, c, tabulacion[f][c]);
                }
            }
        }

        return mayor(tabulacion[filas - 1]);
    }

}

