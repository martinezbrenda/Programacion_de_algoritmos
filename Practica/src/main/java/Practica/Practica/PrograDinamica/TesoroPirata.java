package Practica.Practica.PrograDinamica;

public class TesoroPirata {
    public int robar(int[]cofres){
        int n =cofres.length;
        if(n==0)
            return 0;
        if(n==1)
            return cofres[0];
        if(n==2)
            return Math.max((cofres[0] ), ( cofres[1]));
        int[] acumulado = new int[n];
        acumulado[0] = cofres[0];
        acumulado[1]=Math.max((cofres[0] ), ( cofres[1]));
        for (int i = 2; i< n; i ++)
            acumulado[i] = Math.max( (acumulado[i - 1]), (cofres[i] + acumulado[i - 2]));

       return acumulado[(n-1)];
    }
}
