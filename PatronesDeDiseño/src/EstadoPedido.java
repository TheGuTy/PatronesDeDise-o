
public abstract class EstadoPedido {
	
	protected Pedido pedido;
	
	protected EstadoPedido (Pedido pedido) {
		
		this.pedido = pedido;
	}
	
	public abstract void agregaProducto (Producto producto);
	
	public abstract void borra ();
	
	public abstract void suprimeProducto (Producto producto);
	
	public abstract EstadoPedido estadoSiguiente ();
}
