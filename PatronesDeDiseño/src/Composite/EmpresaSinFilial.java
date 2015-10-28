package Composite;

/**
 * Las instancias de esta clase no pueden agregar filiales.
 * @author GuTy
 *
 */
public class EmpresaSinFilial extends Empresa {

	@Override
	public double calculaCostoMantenimiento() {
		
		return nVehiculos * costeUnitarioVehiculo;
	}

	@Override
	public boolean agregaFilial(Empresa filial) {
		
		return false;
	}

}
