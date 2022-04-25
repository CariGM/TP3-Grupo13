package fi.unju.edo.ar.tp3.enunciado8;

public class Alumno {
	public String nombre;
	public String apellido;
	public int LU;
	public Alumno(String nombre, String apellido, int LU) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.LU = LU;
	}
	
	public String mostrarDatos() {
		return "Nombre: "+nombre+", Apellido: "+apellido+", LU: "+LU;
	}
	public double calcularPromedio(double[] notas) {
		double prom=0;
		double sum=0;
		for(int i=0;i<=4; i++) {
			sum = sum + notas[i];
        }
		prom=sum/5;
		return prom;
		
	}
	
	public double obtenerNotaMaxima(double[] notas) {
		double max=0;
		for(int i=0;i<=4; i++) {
			if(notas[i]>max) {
				max = notas[i];
			}
        }
		return max;
		
		
	}

}