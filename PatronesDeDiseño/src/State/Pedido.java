package State;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	protected List<Producto> productos;
	protected EstadoPedido estadoPedido;
	
	public Pedido () {
		
		productos = new ArrayList<Producto>();
		estadoPedido = new EstadoEnCurso(this);
	}
	
	public void agregaProducto (Producto producto) {
		
		estadoPedido.agregaProducto(producto);
	}
	
	public void suprimeProducto (Producto producto) {
		
		estadoPedido.suprimeProducto(producto);
	}
	
	public void borra () {
		
		estadoPedido.borra();
	}
	
	public void estadoSiguiente () {
		
		estadoPedido = estadoPedido.estadoSiguiente();
	}
	
	public List<Producto> getProductos () {
		
		return productos;
	}
	
	public void visualiza () {
		
		System.out.println("Contenido del pedido");
		for (Producto p: productos)
			p.visualiza();
		System.out.println();
	}
}
