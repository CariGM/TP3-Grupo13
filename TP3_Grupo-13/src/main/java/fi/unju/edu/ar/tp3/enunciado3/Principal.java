package fi.unju.edu.ar.tp3.enunciado3;

import fi.unju.edu.ar.tp3.enunciado3.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		double [] notas = new double[5];
		
		System.out.println("Ingrese nombre: ");
		String nombre=teclado.nextLine();
		
		System.out.println("Ingrese apellido: ");
		String apellido=teclado.nextLine();
		
		System.out.println("Ingrese LU: ");
		int lu=teclado1.nextInt();
		
		System.out.println("Ingrese sus notas: ");
		for(int i=0;i<=4; i++) {
			notas[i]=teclado1.nextInt();
		}
		Alumno yo = new Alumno(nombre,apellido,lu);
		double prom = yo.calcularPromedio(notas);
		double max = yo.obtenerNotaMaxima(notas);
		
		System.out.print(yo.mostrarDatos());
		System.out.print(", promedio de: "+prom);
		System.out.println(", nota maxima: "+max);
	}

}
