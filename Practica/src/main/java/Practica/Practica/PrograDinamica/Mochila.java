package Practica.Practica.PrograDinamica;

public class Mochila {

    public int maxima(int [] pesos, int [] precios, int capacidad){
        int items = precios.length ; // Número de ítems
        int columnas = capacidad + 1; // Capacidad + 1 para manejar desde capacidad 1
        int[][] tab = new int[items + 1][columnas]; // Matriz para almacenar soluciones parciales

        // Llenado de la tabla
        for (int i = 1; i <= items; i++) { // Iterar por cada ítem
            for (int w = 0; w < columnas; w++) { // Iterar por cada capacidad posible
                if (pesos[i - 1] <= w) {
                    // Caso donde podemos incluir el ítem
                    tab[i][w] = Math.max(
                            precios[i - 1] + tab[i - 1][w - pesos[i - 1]], // Incluir el ítem
                            tab[i - 1][w] // No incluir el ítem
                    );
                } else {
                    // Caso donde no podemos incluir el ítem
                    tab[i][w] = tab[i - 1][w];//arrastra el valor de arriba
                }
            }
        }
        return tab[items][capacidad];
    }
}
