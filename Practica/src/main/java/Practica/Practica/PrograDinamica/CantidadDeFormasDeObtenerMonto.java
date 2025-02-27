package Practica.Practica.PrograDinamica;

public class CantidadDeFormasDeObtenerMonto {
    public int obtener ( int []varillas, int longitudMaxima){

        boolean[] esFormable = new boolean[longitudMaxima + 1];
        esFormable[0] = true; // Caso base: siempre podemos formar la longitud 0.

        for (int varilla : varillas) { // Recorre cada varilla disponible
            for (int longitudActual = varilla; longitudActual <= longitudMaxima; longitudActual++) {
                // intenta formar todas las longitudes posibles desde la varilla actual hasta la logitud maxima
                int longitudPrevia = longitudActual - varilla; // Longitud que debería existir antes de agregar la varilla
                if (esFormable[longitudPrevia]) {
                    esFormable[longitudActual] = true; // Si puedo formar "longitudPrevia", también puedo formar "longitudActual"
                }
            }
        }

        // Contar cuántas longitudes distintas se pueden formar
        int cantidadLongitudes = 0;
        for (int i = 1; i <= longitudMaxima; i++) {
            if (esFormable[i]) {
                cantidadLongitudes++;
            }
        }
        return cantidadLongitudes;
    }

}
