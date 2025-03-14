package Practica.Practica;

import Practica.Practica.PrograDinamica.*;
import Practica.Practica.PrograDinamica.RobaCasas;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrograDinamicaTest {
    @Test
    public void testTesoroPirata(){
        int[] cofres1 = {10, 8, 15, 37};
        TesoroPirata tesoroPirata = new TesoroPirata();
        int mayorTesoro1 = tesoroPirata.robar(cofres1);
        assertEquals(47, mayorTesoro1, "El mayor tesoro robado debería ser 47");

        int[] cofres2 = {10, 8, 15, 37, 2, 1, 10, 15};
        int mayorTesoro2 = tesoroPirata.robar(cofres2);
        assertEquals(63, mayorTesoro2, "El mayor tesoro robado debería ser 63");
    }

    @Test
    public void tableroTest(){
        int[][] tablero = {
                {3, 5},
                {4, 6}
        };

        PuntosTablero puntosTablero = new PuntosTablero();

        assertEquals(14,puntosTablero.maximaPuntuacion(tablero), "La mayor cantidad de puntos debería ser 14");
    }

    @Test
    public void MaximoSubconjuntoTest(){
        //int [] conjunto = {3,4,-1,5,-3,2};
        int [] conjunto = {2,-3,4,5,-1,9,9,-4};
        MaximoSubconjunto maximoSubconjunto = new MaximoSubconjunto();
        assertEquals(26,maximoSubconjunto.obtener(conjunto), "La mayor cantidad de puntos debería ser 14");
    }

    @Test
    public void casasTest(){
        int [] casas = {2,10,3,6,8,1,7};
        RobaCasas chorro = new RobaCasas();

        assertEquals(25,chorro.maximoRobo(casas), "La mayor cantidad de plata debería ser 25");

    }

    @Test
    public void MinaDeOroTest(){
        int[][] mina = {
                {2,3,10,1,14},
                {2,8,2,3,1},
                {9,2,4,2,2},
                {2,1,2,2,7},
                {2,3,2,10,2}
        };
        MinaDeOro minero = new MinaDeOro();

        assertEquals(36,minero.cavar(mina), "La mayor cantidad de oro debería ser 36");
    }

    @Test
    public void EdicionTest(){
        String word1 = "inside";
        String word2 = "index";

        DistanciaEdicion edicion = new DistanciaEdicion();

        assertEquals(3,edicion.minimo(word1,word2), "La menor cantidad debería ser 3");
    }

    @Test
    public void MochilaTest(){
        int[] precios = {2,5,8,1};
        int[] pesos = {3,2,5,1};
        int capacidad = 6;

        Mochila mochila = new Mochila();

        assertEquals(9,mochila.maxima(pesos,precios,capacidad), "La mayor cantidad debería ser 55");
    }

    @Test
    public void FibonacciTest(){
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(13,fibonacci.obtener(7), "El valor debería ser 13");
    }

    @Test
    public void SubRectangulos(){
        int[][] matriz = {
                {1, 2, -1, -4, -20},
                {-8, -3, 4, 2, 1},
                {3, 8, 10, 1, 3},
                {-4, -1, 1, 7, -6}
        };
        SumaDeSubrectangulos sumaDeSubrectangulos = new SumaDeSubrectangulos();
        assertEquals(29, sumaDeSubrectangulos.encontrarMaximoSubrectangulo(matriz), "El valor debería ser 29");
    }

    @Test
    public void varillaTest(){
        int [] longuitudes = {2,4,7};
        CantidadDeFormasDeObtenerMonto varilla = new CantidadDeFormasDeObtenerMonto();
        assertEquals(7, varilla.obtener(longuitudes, 10));
    }

    @Test
    public void AbejaTest(){
        PanalDeAbeja abeja = new PanalDeAbeja();
        assertEquals(11,abeja.contarCaminos(2) );
    }
}
