package Composite;

import java.util.ArrayList;
import java.util.List;

public class EmpresaMadre extends Empresa {

	protected List<Empresa> filiales = new ArrayList<Empresa>();
	
	@Override
	public double calculaCostoMantenimiento() {
		
		double costo = 0;
		for (Empresa e:filiales)
			costo += e.calculaCostoMantenimiento();
		return costo + nVehiculos * costeUnitarioVehiculo;
	}

	@Override
	public boolean agregaFilial(Empresa filial) {
		
		return filiales.add(filial);
	}

}
