package State;

public class EstadoEnCurso extends EstadoPedido {

	public EstadoEnCurso (Pedido pedido) {
		
		super(pedido);
	}
	
	@Override
	public void agregaProducto(Producto producto) {
		
		pedido.getProductos().add(producto);
	}

	@Override
	public void borra() {
		
		pedido.getProductos().clear();
	}

	@Override
	public void suprimeProducto(Producto producto) {
		
		pedido.getProductos().remove(producto);
	}

	@Override
	public EstadoPedido estadoSiguiente() {
		
		return new EstadoValidado(pedido);
	}

}
