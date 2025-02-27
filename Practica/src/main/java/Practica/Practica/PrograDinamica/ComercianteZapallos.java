package Practica.Practica.PrograDinamica;
import java.util.Stack;

public class ComercianteZapallos {

    // Función para maximizar la ganancia del comerciante
    public static int maximizarGanancia(int[] precios, int capacidad) {
        int ganancia = 0;
        Stack<Integer> cajasSeleccionadas = new Stack<>();  // Pila para las cajas seleccionadas

        // Iterar sobre cada precio de las cajas
        for (int precio : precios) {
            // Mientras la pila no esté vacía y el precio actual sea mayor que el último en la pila
            // y haya espacio en el camión, reemplazar la caja más cara por la más barata
            while (!cajasSeleccionadas.isEmpty() && precio > cajasSeleccionadas.peek()
                    && cajasSeleccionadas.size() < capacidad) {
                cajasSeleccionadas.pop();
            }

            // Si hay espacio en el camión, agregar la caja actual
            if (cajasSeleccionadas.size() < capacidad) {
                cajasSeleccionadas.push(precio);
                ganancia += 10;  // Cada zapallo genera una ganancia de 10
            }
        }

        return ganancia;
    }

    // Función principal para probar el programa
    public static void main(String[] args) {
        int[] precios = {12, 5, 8, 10, 6, 14};  // Precios de las cajas de zapallos
        int capacidad = 3;  // Capacidad máxima del camión

        // Llamada a la función para obtener la ganancia máxima
        int gananciaTotal = maximizarGanancia(precios, capacidad);

        // Imprimir el resultado
        System.out.println("La ganancia total es: " + gananciaTotal);
    }
}
