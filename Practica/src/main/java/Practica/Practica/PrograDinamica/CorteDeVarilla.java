package Practica.Practica.PrograDinamica;

public class CorteDeVarilla {
    public int obtenerMaximo(int[] valores, int tamVarilla){
        int valorMax = 0, valor;
        int [] mejorValor = new int[tamVarilla + 1];

        for (int longitudActual = 1; longitudActual < tamVarilla; longitudActual++) {

            for (int tamCorte = 1; tamCorte < longitudActual; tamCorte++) {

                mejorValor[longitudActual] = Math.max(
                        mejorValor[longitudActual] , valores[tamCorte] + mejorValor[longitudActual - tamCorte]
                );
                // mejorValor[longitudActual - tamCorte] representa a la máxima ganancia de la parte restante ya que
                // estamos viendo si conviene serpararla o no
            }

        }
        return mejorValor[tamVarilla];
    }
}
