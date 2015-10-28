package Builder;

public class DocumentacionPdf extends Documentacion {

		@Override
	public void agregaDocumento(String documento) {
		
		if (documento.startsWith("<PDF>"))
			contenido.add(documento);
	}

	@Override
	public void imprime() {
		
		System.out.println("Documentacion Pdf");
		for (String s: contenido)
			System.out.println(s);
	}

}
