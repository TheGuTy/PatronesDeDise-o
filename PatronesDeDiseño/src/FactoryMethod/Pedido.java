package FactoryMethod;

public abstract class Pedido {

	protected double importe;
	
	protected Pedido(double importe) {
		
		this.importe = importe;
	}

	public abstract boolean valida ();
	
	public abstract void paga ();
}
