package AbstractFactory;

public class ScooterGasolina extends Scooter {

	public ScooterGasolina(String modelo, String color, int potencia) {
		super(modelo, color, potencia);
		
	}

	@Override
	public void mostrarCaracteristicas() {
		
		System.out.println("Scooter gasolina de modelo: " + modelo + " de color: " + color + " de potencia: " + potencia);
	}
	
}
