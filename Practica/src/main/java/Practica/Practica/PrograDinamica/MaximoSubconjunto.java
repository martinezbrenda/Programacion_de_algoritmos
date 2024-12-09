package Practica.Practica.PrograDinamica;

public class MaximoSubconjunto {
    private void inicializarEnCero(int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = 0;
            }
        }

    }

    private void imprimir(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public int obtener(int[] arreglo){
        int n = arreglo.length;
        int[][] m = new int[n][n];
        inicializarEnCero(m);
        System.arraycopy(arreglo, 0, m[0], 0, n);

            for (int f = 1; f < n; f++) {
                for (int c = f ; c < n ; c++) {
                    if(c == f)
                        m[f][f] = (arreglo[c-1] + arreglo[c]);
                    else
                        m[f][c] = m[f][c - 1] + arreglo[c];

                }
        }
        imprimir(m);
        // Encontrar la máxima suma
        int maxSuma = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                maxSuma = Math.max(maxSuma, m[i][j]);
                //si te piden desde donde arrancar y cuando parar son la i y la j
            }
        }

        return maxSuma;
    }
}
