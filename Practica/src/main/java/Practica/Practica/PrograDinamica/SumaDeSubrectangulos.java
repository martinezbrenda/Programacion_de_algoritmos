package Practica.Practica.PrograDinamica;

public class SumaDeSubrectangulos {
    public static int encontrarMaximoSubrectangulo(int[][] matriz) {
        int N = matriz.length;
        int M = matriz[0].length;
        int[][] S = construirMatrizAcumuladora(matriz);

        int maxSuma = Integer.MIN_VALUE;
        int[] mejorSubrectangulo = new int[4];  // r1, c1, r2, c2

        for (int r1 = 0; r1 < N; r1++) {
            for (int r2 = r1; r2 < N; r2++) {
                for (int c1 = 0; c1 < M; c1++) {
                    for (int c2 = c1; c2 < M; c2++) {
                        int sumaActual = obtenerSumaSubrectangulo(S, r1, c1, r2, c2);
                        if (sumaActual > maxSuma) {
                            maxSuma = sumaActual;
                            mejorSubrectangulo[0] = r1;
                            mejorSubrectangulo[1] = c1;
                            mejorSubrectangulo[2] = r2;
                            mejorSubrectangulo[3] = c2;
                        }
                    }
                }
            }
        }
        System.out.println("Máxima suma: " + maxSuma);
        System.out.println("Subrectángulo desde (" + mejorSubrectangulo[0] + "," + mejorSubrectangulo[1] + ") hasta (" +
                mejorSubrectangulo[2] + "," + mejorSubrectangulo[3] + ")");
        return maxSuma;
    }

    public static int [][] construirMatrizAcumuladora(int[][] matriz) {
            int filas = matriz.length;
            int columnas = matriz[0].length;
            int [][] acumulado = new int [filas][columnas];

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    acumulado[i][j] = matriz[i][j];
                    if (i > 0) acumulado[i][j] += acumulado[i - 1][j];  // Sumar la fila superior
                    if (j > 0) acumulado[i][j] += acumulado[i][j - 1];  // Sumar la columna izquierda
                    if (i > 0 && j > 0) acumulado[i][j] -= acumulado[i - 1][j - 1];  // Restar la intersección sumada dos veces
                }
            }
            return acumulado;
        }

    public static int obtenerSumaSubrectangulo(int[][] S, int r1, int c1, int r2, int c2) {
        int suma = S[r2][c2];
        if (r1 > 0) suma -= S[r1 - 1][c2];
        if (c1 > 0) suma -= S[r2][c1 - 1];
        if (r1 > 0 && c1 > 0) suma += S[r1 - 1][c1 - 1];
        return suma;
    }


}
