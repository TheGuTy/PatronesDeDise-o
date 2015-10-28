package Memento;

import java.util.ArrayList;
import java.util.List;

public class CarritoOpciones {

	protected List<OpcionVehiculo> opciones = new ArrayList<OpcionVehiculo>();
	
	/**
	 * Suprime aquellas opciones incompatibles con la nueva opcion antes de agregarla.
	 * Crea un nuevo memento que recibe el estado inicial.
	 * @param opcionVehiculo estado inicial.
	 * @return memento creado.
	 */
	public Memento agregaOpcion (OpcionVehiculo opcionVehiculo) {
		
		Memento resultado = new Memento();
		
		resultado.setEstado(opciones);
		opciones.removeAll(opcionVehiculo.getOpcionesIncompatibles());
		
		opciones.add(opcionVehiculo);		
		return resultado;
	}

	public void anula (Memento memento) {
		
		opciones = memento.getEstado();
	}
	
	public void visualiza () {
		
		System.out.println("Contenido del carrito de opciones");
		for (OpcionVehiculo opcion: opciones)
			opcion.visualiza();
		System.out.println();
	}
}
