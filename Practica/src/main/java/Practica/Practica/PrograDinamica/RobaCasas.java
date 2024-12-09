package Practica.Practica.PrograDinamica;

import java.util.Arrays;

public class RobaCasas {

    public int maximoRobo(int [] casas){
        int cant = casas.length;
        int i = 2;
        int [] acum = new int[cant];
        int anterior;
        int roboActual, roboAnterior;

        if(cant == 0 )
            return 0;
        if(cant == 1)
            return casas[0];
        if(cant == 2)
            return Math.max(casas[0], casas[1]);

        acum[0] = casas[0];
        acum[1] = Math.max(casas[0], casas[1]);

        for(i=2; i <cant ; i++){

            roboActual = casas[i] + acum[i-2];
            roboAnterior = acum[i-1];

            if(roboAnterior > roboActual){
                System.out.printf("Acumulo %d \n", roboAnterior);
                acum[i] = roboAnterior;

            }else{
                System.out.printf("Acumulo %d \n", roboActual);
                acum[i] = roboActual;

            }

        }
        System.out.print("Array acum:\n");

        for (int k = 0; k < acum.length ; k++) {
            System.out.printf("|%d|  ", acum[k]);
        }
        return acum[cant-1];
    }
}

