package Practica.Practica.PrograDinamica;

public class DistanciaEdicion {
    public int minimo(String word1, String word2){
            int filas = word1.length();
            int columnas = word2.length();

            // Crear matriz dp de tamaño (m+1) x (n+1)
            int[][] tabulacion = new int[filas + 1][columnas + 1];
            // cada celda de la matriz reprentara la distancia minima de edicion

            // Inicializar los casos base
            for (int i = 0; i <= filas; i++) {
                tabulacion[i][0] = i; // Eliminar todos los caracteres de word1
            }
            for (int j = 0; j <= columnas; j++) {
                tabulacion[0][j] = j; // Insertar todos los caracteres de word2
            }
            //esto deja la matriz con todas las posiciones

            // Llenar la matriz dp
            for (int f = 1; f <= filas; f++) {
                for (int j = 1; j <= columnas; j++) {
                    if (word1.charAt(f - 1) == word2.charAt(j - 1)) {
                        tabulacion[f][j] = tabulacion[f - 1][j - 1]; // Sin operación, pongo el elemento de la diagonal
                    } else {
                        tabulacion[f][j] = 1 + Math.min(tabulacion[f - 1][j], // Eliminación, pongo el valor que esta arriba
                                Math.min(tabulacion[f][j - 1], // Inserción, pongo el valor que tenia a la izq
                                        tabulacion[f - 1][j - 1])); // Sustitución, pongo el valor de la diagonal
                    }
                }
            }

            // Retornar la distancia de edición entre word1 y word2
            return tabulacion[filas][columnas];
        }

    }

