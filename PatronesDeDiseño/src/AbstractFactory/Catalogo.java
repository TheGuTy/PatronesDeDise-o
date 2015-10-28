package AbstractFactory;

import java.util.Scanner;

public class Catalogo {

	public static int nAutos = 3;
	public static int nScooters = 2;
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		FabricaVehiculo fabrica;
		Automovil[] autos = new Automovil[nAutos];
		Scooter[] scooters = new Scooter[nScooters];
		
		System.out.print("Presione 1 para vehiculos electricos y 2 para vehiculos a gasolina.");
		int opcion = reader.nextInt();
		if (opcion == 1)
			fabrica = new FabricaVehiculoElectricidad();
		else
			fabrica = new FabricaVehiculoGasolina();
		
		for (int i = 0; i < nAutos; i++)
			autos[i] = fabrica.creaAutomovil("estandar", "amarillo", 6+i, 3.2);
		
		for (int i = 0; i < nScooters; i++)
			scooters[i] = fabrica.creaScooter("clasico", "rojo", 2+i);
		
		for (Automovil a: autos)
			a.mostrarCaracteristicas();
		
		for (Scooter s: scooters)
			s.mostrarCaracteristicas();
	}

}
