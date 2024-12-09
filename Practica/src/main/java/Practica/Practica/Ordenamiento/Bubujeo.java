package Practica.Practica.Ordenamiento;

public class Bubujeo {
    public void ordenar (int [] v){
        boolean intercambio = false;
        int aux;
        for (int i = 0; i < v.length - 1 ; i++) {
            for (int j = 0; j < v.length - 1 - i ; j++) {
                if(v[j] > v[j+1]){
                aux = v[j+1];
                v[j+1] = v[j];
                v[j] = aux;
                }
            }
        }

    }

}
