//Exercise 5.1.  Try to do the exercise of Java Course: Chapter 7a, but instead to generate tickets, try to generate random strings of 5 length.
// When you will print the strings, change it to UpperCase.

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;

import java.util.concurrent.ThreadLocalRandom;


public class t5e1 {
    public static void main(String[] args) {
        int longitud = 5;
        String cadena = cadenaAleatoria(longitud);
        System.out.printf("Cadena aleatoria de %d caracteres en minuscula es: %s\n", longitud, cadena);
        String mayuscula = cadena.toUpperCase(Locale.ROOT);
        System.out.printf("Cadena aleatoria de %d caracteres en mayuscula es: %s\n", longitud, mayuscula);

    }

    public static String cadenaAleatoria(int longitud) {
        // El banco de caracteres
        String banco = "abcdefghijklmnopqrstuvwxyz";
        // La cadena en donde iremos agregando un carácter aleatorio
        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    }
