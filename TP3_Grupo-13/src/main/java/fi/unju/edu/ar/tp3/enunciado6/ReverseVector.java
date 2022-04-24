package fi.unju.edu.ar.tp3.enunciado6;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ArrayList <Integer> vec = new ArrayList <Integer>();
		System.out.println("Ingrese Numeros: ");
		for(int i=0;i<10;i++) {
			vec.add(teclado.nextInt());
		}
		System.out.println("Cadena Invertida");
		for(int i=9;i>=0;i--) {
			System.out.println("Posicion:"+(i+1)+" valor:"+vec.get(i));
		}
	}

}
