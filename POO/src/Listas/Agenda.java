package Listas;

public class Agenda 
{
	/**
	 * Ordenamos la agenda alfabeticamente por nombre
	 */
	
		public void ordenar() {
			/*Recorremos el array comparando
			 * elementos adyacentes. Si no estan bien colocados
			 * los intercambiamos.
			 */
		boolean hayIntercambio;
		
		do {
			hayIntercambio = false;
			for (int i = 0; i<numElem -1;i++) {
				if (contactos[i].getNombre().compareTo(Contactos[i+1].getNombre()) > 0) {
					//Si es cierto ordenamos los elementos
					Contacto aux = contactos[i+1];
					contactos[i+1] = contactos [i];
					contactos[i] = aux;
					hayIntercambio = true;
				}
			}
		}while(hayIntercambio);
	
	}
	/*
	 * Mostramos toda la agenda por pantalla	
	 */
	
	public void verAgenda() {
		for(int i = 0; i < numElem; i++) {
			System.out.println(Contactos[i].toString());
		}
	}





}		
