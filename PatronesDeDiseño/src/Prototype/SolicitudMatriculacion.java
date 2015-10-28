package Prototype;

public class SolicitudMatriculacion extends Documento {

	@Override
	public void imprime() {
		
		System.out.println("Imprime la solicitud de matriculacion: " + contenido);
	}

	@Override
	public void visualiza() {
		
		System.out.println("Muestra la solcitud de matriculacion: " + contenido);
	}

}
