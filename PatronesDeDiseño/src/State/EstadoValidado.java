package State;

public class EstadoValidado extends EstadoPedido {

	
	public EstadoValidado (Pedido pedido) {
		
		super(pedido);
	}
	
	@Override
	public void agregaProducto(Producto producto) {}

	@Override
	public void borra() {
		
		pedido.getProductos().clear();
	}

	@Override
	public void suprimeProducto(Producto producto) {}

	@Override
	public EstadoPedido estadoSiguiente() {
		
		return new EstadoEntregado(pedido);
	}

}
