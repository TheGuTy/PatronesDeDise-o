package State;

public class EstadoEntregado extends EstadoPedido {

	public EstadoEntregado (Pedido pedido) {
		
		super(pedido);
	}
	
	
	@Override
	public void agregaProducto(Producto producto) {}

	@Override
	public void borra() {}

	@Override
	public void suprimeProducto(Producto producto) {}

	@Override
	public EstadoPedido estadoSiguiente() {
		
		return this;
	}

}
