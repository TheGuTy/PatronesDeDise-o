package State;

public class Usuario {

	public static void main(String[] args) {
		
		Pedido pedido1 = new Pedido();		
		pedido1.agregaProducto(new Producto("Vehiculo 1"));
		pedido1.agregaProducto(new Producto("Accesorio 2"));
		pedido1.visualiza();		
		pedido1.estadoSiguiente();
		pedido1.agregaProducto(new Producto("Accesorio 3"));
		pedido1.borra();
		pedido1.visualiza();
		
		Pedido pedido2 = new Pedido();		
		pedido2.agregaProducto(new Producto("Vehiculo 11"));
		pedido2.agregaProducto(new Producto("Accesorio 21"));
		pedido2.visualiza();
		pedido2.estadoSiguiente();
		pedido2.visualiza();
		pedido2.estadoSiguiente();
		pedido2.borra();
		pedido2.visualiza();
	}

}
