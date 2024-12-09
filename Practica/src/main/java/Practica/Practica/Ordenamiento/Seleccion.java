package Practica.Practica.Ordenamiento;

    public class Seleccion {
        public void ordenar(int[]vector){
           int cant = vector.length;
           int pos_menor;
           int temp;
            for (int i = 0; i < cant -1 ; i++) {
                pos_menor = i;
                for (int j = i+1; j < cant; j++) {
                    if (vector[j] < vector[pos_menor])
                        pos_menor = j;
                }
                temp = vector[i];
                vector[i] = vector[pos_menor];
                vector[pos_menor] = temp;
            }
                                        }
}
