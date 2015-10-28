package AbstractFactory;

public abstract class FabricaVehiculo {

	public abstract Automovil creaAutomovil (String modelo, String color, int potencia, double espacio);
	
	public abstract Scooter creaScooter (String modelo, String color, int potencia);
}
