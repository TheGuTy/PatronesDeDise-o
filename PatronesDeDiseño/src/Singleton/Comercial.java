package Singleton;

public class Comercial {

	protected String nombre;
	protected String direccion;
	protected String email;
	
	private static Comercial instance = null;
	
	private Comercial () {}
	
	public static Comercial Instance () {
		
		if (instance == null)
			instance = new Comercial();
		return instance;
	}
	
	public void visualiza () {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("Email: " + email);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public void setDireccion(String direccion) {
		
		this.direccion = direccion;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
	}
}
