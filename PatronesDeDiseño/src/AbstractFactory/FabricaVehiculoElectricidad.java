package AbstractFactory;

public class FabricaVehiculoElectricidad extends FabricaVehiculo {

	@Override
	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		
		return new AutomovilElectricidad(modelo, color, potencia, espacio);
	}

	@Override
	public Scooter creaScooter(String modelo, String color, int potencia) {
		
		return new ScooterElectrico(modelo, color, potencia);
	}

}
