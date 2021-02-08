package cuenta;

import java.util.Scanner;

public class Cuenta { 
	//Declaramos los atributos
		private String numCuenta;
		private String nombreTitular;
		private double saldo;
		private double tipoInteres;
	
		
	//Crear el constructor
		public Cuenta(String numCuenta, String nombreTitular, double saldo, double tipoInteres) {
			super();
			this.numCuenta = numCuenta;
			this.nombreTitular = nombreTitular;
			this.saldo = saldo;
			this.tipoInteres = tipoInteres;
		}
		
		//Crear otro constructor en el que, en vez de pasar
		public Cuenta() {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduzca el número de cuenta: ");
			numCuenta = entrada.nextLine();
			
			System.out.println("Introduzca el nombre del titular: ");
			nombreTitular = entrada.nextLine();
			
			System.out.println("Introduce el saldo: ");
			saldo = entrada.nextDouble();
			
			System.out.println("Introduzca el tipo de interés: ");
			tipoInteres = entrada.nextDouble();
		}
		
		//Crear un tercer constructor para copiar cualquier objeto
		public Cuenta(Cuenta copia) {
			numCuenta = copia.numCuenta;
			nombreTitular = copia.nombreTitular;
			saldo = copia.saldo;
			tipoInteres = copia.tipoInteres;
		}


		public String getNumCuenta() {
			return numCuenta;
		}


		public void setNumCuenta(String numCuenta) {
			this.numCuenta = numCuenta;
		}


		public String getNombreTitular() {
			return nombreTitular;
		}


		public void setNombreTitular(String nombreTitular) {
			this.nombreTitular = nombreTitular;
		}


		public double getSaldo() {
			return saldo;
		}


		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}


		public double getTipoInteres() {
			return tipoInteres;
		}


		public void setTipoInteres(double tipoInteres) {
			this.tipoInteres = tipoInteres;
		}
		
		//Creamos el método ingreso
		
		public void ingreso (double cantidad) {
			if (cantidad > 0) {
				saldo = saldo + cantidad;
			}
			else {
				System.out.println("La cantidad tiene que ser mayor que 0");
			}
		}
		
		//Creamos el método reintegro 
		
		public void reintrego (double cantidad) {
			//Comprobamos que la cantidad sea mayor que 0
			if (cantidad <= 0) {
				System.out.println("La cantidad tiene que ser mayor que 0");
			}
			else if (cantidad > saldo) {
				System.out.println("La cantidad supera el saldo disponible");
			}
			else {
				saldo = saldo - cantidad;
			}
		}
		
		//Crear un método que muestre toda la información de la cuenta
		public void verDatos() {
			System.out.println("Número de cuenta: " + numCuenta);
			System.out.println("Nombre del titular: " + nombreTitular);
			System.out.println("Saldo: " + saldo);
			System.out.println("Tipo de interés: " + tipoInteres);
		}
	

}
