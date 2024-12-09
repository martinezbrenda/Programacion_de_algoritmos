package Practica.Practica.Ordenamiento;

public class Shell {
    public void ordenar(int[] v){
        int n = v.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Ordenamos cada sub-arreglo que está a distancia 'gap'
            for (int i = gap; i < n; i++) {
                int temp = v[i];
                int j;

                // Realizamos la inserción de arreglo[i] en el sub-arreglo ordenado
                for (j = i; j >= gap && v[j - gap] > temp; j -= gap) {
                    v[j] = v[j - gap];
                }

                // Ponemos el valor temporal en su posición correcta
                v[j] = temp;
            }
        }

    }
}
