package fi.unju.edu.ar.tp3.enunciado5;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.util.Chars;

public class ReverseString {

	public static void main(String[] args) {
		
		ArrayList<Chars> caracteres = new ArrayList <Chars>();
   	 
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Ingrese cadena a invertir:");
	    
	    String cadena = entrada.nextLine();
	    
	    int L = cadena.length();
		
	    System.out.print("\nCadena Invertida : ");
	    
	    for(int i = L-1; i >= 0; i--) {
	    	
	    	System.out.print(cadena.charAt(i));
	    	
	    }
	    
	}

}
