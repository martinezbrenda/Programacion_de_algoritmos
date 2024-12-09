package Practica.Practica.Ordenamiento;

public class Insercion {

    public void ordenar (int [] v){
        int n = v.length;
        int clave;
        int j = 0; // tiene que tener el tam de la sublista ya ordenada
        for (int i = 0; i < n-1 ; i++) {
            j = i - 1 ; // porque los primeros dos elementos siempre los voy a tener ord con solo un swap
            clave = v[i];
            //verifico que sea mayor que cero para no estar viendo cosas q no pertenezcan a mi array
            while(j>=0 && v[j] > clave){
                v[j+1]= v[j];
                j--;
            }
            v[j+1] = clave;
        }

    }
}
