package fi.unju.edu.ar.tp3.enunciado5;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.util.Chars;

public class ReverseString {

	public static void main(String[] args) {
	   	 
		char [] caracteres = new char [999];
		
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Ingrese cadena a invertir:");
	    
	    String cadena = entrada.nextLine();
	    
	    int L = cadena.length();
	    
	    for(int i = 0; i < L; i++) {
	    	
	    	caracteres[i]=cadena.charAt(i);
	    	
	    }
	    
	    System.out.print("\nCadena Invertida : ");
	    
	    for(int i = L-1; i >= 0; i--) {
    	
    	System.out.print(caracteres[i]);
   	    
	    }
	    
	}

}
