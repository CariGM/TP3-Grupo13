package fi.unju.edu.ar.tp3.enunciado9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import fi.unju.edu.ar.tp3.enunciado9.Producto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		ArrayList<String>producto = new ArrayList<String>();
		int op=0;
		String prod = "";
		char res =' ';
		do{
			System.out.println("Ingrese una opciones: ");
			op = teclado.nextInt();
			switch (op) {
				case 1:
					System.out.println("Nuevo Producto:");
					System.out.println("Ingrese el nombre del producto: ");
					Producto P1 = new Producto(teclado2.nextLine());
					producto.add(P1);
					break;
				case 2:
					System.out.println("Mostrar todos los productos:");
					for(int i=0; i < producto.size() ; i++) {
						System.out.println("Producto num"+(i+1)+": "+producto.get(i));
					}
					break;
				case 3:
					System.out.println("Incrementar precio a todos los productos:");
					break;
				case 4:
					System.out.println("Monto total de todos los productos:");
					break;
				default:
					System.out.println("Opcion incorrecta");
			}
			if(op!=5) {
				System.out.println("Desea realizar una nueva accion? (s/n)");
				res = teclado1.next().charAt(0);
			}
		}while(op != 5 && res != 'n');
		System.out.println("Fin del programa");
	}

}
