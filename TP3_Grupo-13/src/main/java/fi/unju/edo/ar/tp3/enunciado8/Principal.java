package fi.unju.edo.ar.tp3.enunciado8;

import ashei.ashei.god.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		double [] notas = new double[5];
		int num=0;
		do {
		System.out.println("ingrese una opcion");
		System.out.println("1-Nuevo Alumno");
		System.out.println("2-Eliminar Alumno");
		System.out.println("3-Modificar Notas");
		System.out.println("4-Mostrar Todos los Alimnos");
		System.out.println("5-Mostrar los que superan el promedio de 6");
		System.out.println("6-Salir");
		num=teclado1.nextInt();
		switch (num) {
		case 1:
			//System.out.println("..");
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
			break;
		case 2:
			
			break;
		case 4:
			System.out.println(nombre);
			
			
			Alumno yo = new Alumno(nombre,apellido,lu);
			double prom = yo.calcularPromedio(notas);
			double max = yo.obtenerNotaMaxima(notas);
			System.out.print(yo.mostrarDatos());
			System.out.print(", promedio de: "+prom);
			System.out.println(", nota maxima: "+max);
			
			break;						
		case 6:
			System.out.println("saliuu");
			break;
			
		default:
			System.out.println("La opcion que ingreso no es correcta");
			break;
			}
		}while(num!=6);
		
	}

}