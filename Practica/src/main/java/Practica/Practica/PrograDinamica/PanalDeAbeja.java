package Practica.Practica.PrograDinamica;

public class PanalDeAbeja {


    public static int contarCaminos(int N) {
        int filas = 2 * N - 1;  // Altura del panal
        int columnas = 2 * N - 1; // Ancho del panal (ajustado para N)

        // Crear la matriz de programación dinámica
        int[][] dp = new int[filas][columnas];
        dp[0][0] = 1; // La abeja empieza en la posición A (celdas de (0,0))

        // Procesar todas las celdas
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if (dp[f][c] > 0) { // Solo procesamos si hay caminos posibles hasta aquí

                    // Movimiento hacia abajo (↓)
                    if (f + 1 < filas) {
                        dp[f + 1][c] += dp[f][c] +1 ;
                    }

                    // Movimiento hacia abajo a la derecha (↘)
                    if (f + 1 < filas && c + 1 < columnas) {
                        dp[f + 1][c + 1] += dp[f][c] +1 ;
                    }

                    // Movimiento hacia arriba a la derecha (↗)
                    if (f > 0 && c + 1 < columnas) {
                        dp[f - 1][c + 1] += dp[f][c] + 1;
                    }
                }
            }
        }

        // El objetivo es llegar a la celda B (en la posición (N-1, 2*N-2))
        return dp[N-1][N-1];  // La celda B está en la fila N-1 y columna 2*N-2
    }



}
