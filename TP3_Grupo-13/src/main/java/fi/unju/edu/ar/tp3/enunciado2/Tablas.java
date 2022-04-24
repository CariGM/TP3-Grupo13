package fi.unju.edu.ar.tp3.enunciado2;
import java.util.Scanner;

public class Tablas {

	public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Scanner entrada=new Scanner(System.in);
        int [] numero = new int[11];
        int b,aux = 1;
        char a='x';
        while(a != 'n' && a != 'N'){
            System.out.println("ingrese un numero del 1 al 9 para ver la tabla");
            b=teclado.nextInt();
            for(int i=1;i<=10;i++){
            numero[i]=b*i;
            System.out.println(b+" x "+i+" = "+numero[i]);
        }
        aux=1;
        a = 'x';
        while((a != 'n' && a != 'N') && (a != 's' && a != 'S')) {
        System.out.println("desea ingresesar otro numero¿");
        a=entrada.next().charAt(0);
        }
        //System.out.println(a);
        };
        System.out.println("fin de la ejecucion");
		}
    }