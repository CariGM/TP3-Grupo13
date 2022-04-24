package fi.unju.edu.ar.tp3.enunciado4;
import java.util.ArrayList;
import java.util.Scanner;

public class ParImpar {

     public static void main(String[] args) {

         Scanner n = new Scanner(System.in);

         int numeros[] = new int[5];

        // System.out.println("a");

         for(int i=0;i<5;i++) {
             System.out.print((i+1) + " Digite un numero: ");
             numeros[i] = n.nextInt();
             if(numeros[i]%2==0) {
            	 System.out.println("es par");
             }else {
            	 System.out.println("es impar");
             }
         }
         System.out.println("\nImprimir los elementos del arreglo");
         for(int i:numeros) {  
        		 System.out.println(i);  
         }
     }
}