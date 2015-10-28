package Memento;

import java.util.ArrayList;
import java.util.List;

public class OpcionVehiculo {

	protected String nombre;
	protected List<OpcionVehiculo> opcionesIncompatibles = null;
	
	public OpcionVehiculo (String nombre) {
		
		this.nombre = nombre;
		opcionesIncompatibles = new ArrayList<OpcionVehiculo>();
	}
	
	public void agregaOpcionIncompatible (OpcionVehiculo opcionIncompatible) {
		
		if (!opcionesIncompatibles.contains(opcionIncompatible)) {
			opcionesIncompatibles.add(opcionIncompatible);
			opcionIncompatible.agregaOpcionIncompatible(this);
		}
	}
	
	public List<OpcionVehiculo> getOpcionesIncompatibles () {
		
		return opcionesIncompatibles;
	}
	
	public void visualiza () {
		
		System.out.println("opcion: " + nombre);
	}
}
