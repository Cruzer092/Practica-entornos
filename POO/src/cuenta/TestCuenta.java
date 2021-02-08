package cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		
		//Instanciamos un objeto tipo cuenta
		Cuenta cuenta1 = new Cuenta("ES34/46202", "María Gómez", 100, 0.01);
		
		
		//Comprobamos si funcióna
		System.out.println("El saldo actual es: " + cuenta1.getSaldo());
		
		//Ingresamos 50€
		cuenta1.ingreso(50);
		
		//Comprobamos el restante
		System.out.println("El saldo actual es: " + cuenta1.getSaldo());
		
		//Sacamos 25€
		cuenta1.reintrego(25);
		
		//Comprobamos el restante
		System.out.println("El saldo actual es: " + cuenta1.getSaldo());
		
		//Intentamos retirar una cantidad negativa
		cuenta1.reintrego(-30);
		
		//Intentamos retirar una cantidad mayor que el saldo
		cuenta1.reintrego(130);
		
		//Comprobamos el restante
		System.out.println("El saldo actual es: " + cuenta1.getSaldo());
		
		//Creamos una segunda cuenta introduciendo los parámetros
		Cuenta cuenta2 = new Cuenta();
		
		//Mostrar información de la cuenta que me he creado
		cuenta2.verDatos();
		
		//Hacemos una copia de cuenta2
		Cuenta cuenta3 = new Cuenta (cuenta2);
		
		//Mostramos los datos de cuenta3
		cuenta3.verDatos();

	}

}
