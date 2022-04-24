package fi.unju.edu.ar.tp3.enunciado1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

     public static void main(String[] args) {

             ArrayList<Integer> numeros = new ArrayList <Integer>();
             ArrayList<Integer> numeros2 = new ArrayList <Integer>();

            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingrese los valores para el primer arreglo.");
             for(int i=0;i<5;i++) {
                 System.out.print((i+1) + " Ingrese un numero: ");
                 numeros.add(entrada.nextInt());
             }

             System.out.println("Ingrese los valores para el segundo arreglo.");

             for(int i=0;i<5;i++) {
                 System.out.print((i+1) + " Ingrese un numero: ");
                 numeros2.add(entrada.nextInt());
             }

             System.out.println("Realizacion de divisiones.");

             for(int i=0;i<=4;i++) {
                  try {
                      float res = numeros.get(i) / numeros2.get(i);
                      System.out.println(numeros.get(i) + " / " + numeros2.get(i) + " = " + res);
                  }
                  catch (ArithmeticException e) {
                      System.out.println("No es posible dividir por 0.");
                  }
            }
     }
}