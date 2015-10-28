package Composite;

public abstract class Empresa {

	protected static double costeUnitarioVehiculo = 5;
	protected int nVehiculos;
	
	public void agregaVehiculo () {
		
		nVehiculos++;
	}

	public abstract double calculaCostoMantenimiento ();
	
	public abstract boolean agregaFilial (Empresa filial);
}
