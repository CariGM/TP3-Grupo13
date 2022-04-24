package fi.unju.edu.ar.tp3.enunciado7;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.logging.log4j.util.Chars;

public class Frutas {

	public static void main(String[] args) {
		
		ArrayList<String> frutas = new ArrayList <String>();
		
		Scanner entrada = new Scanner(System.in);
		Scanner desicion = new Scanner(System.in);
		
		char slct = 'x';

		while(slct != 'n' && slct != 'N'){
			
			System.out.println("Ingrese el nombre de una fruta : ");
			
			frutas.add(entrada.nextLine());
			
			slct = 'x';
			
			while((slct != 'n' && slct != 'N') && (slct != 's' && slct != 'S')) {
				System.out.println("Desea ingresar mas datos?");
				slct = desicion.next().charAt(0);
			}
			
		}
		
		System.out.println("Frutas con indice par: ");
		
		for(int i=0; i < frutas.size() ; i++) {
			
			if(i % 2 == 0) {
				
				System.out.println(frutas.get(i));
				
			}
		}
	}
}