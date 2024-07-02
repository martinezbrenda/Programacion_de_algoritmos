package Practica.Practica.Busqueda;

import java.util.ArrayList;

public class BusquedaBinaria {

    public int buscar(ArrayList<Integer> lista, int buscado){
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).equals(buscado))
                return i;
        }
        return -1;
    }
}
