package FactoryMethod;

public class Usuario {

	public static void main(String[] args) {
		
		Cliente cliente;
		cliente = new ClienteContado();
		cliente.nuevoPedido(2000);
		cliente.nuevoPedido(10000);
		
		cliente = new ClienteCredito();
		cliente.nuevoPedido(2000);
		cliente.nuevoPedido(10000);
	}

}
