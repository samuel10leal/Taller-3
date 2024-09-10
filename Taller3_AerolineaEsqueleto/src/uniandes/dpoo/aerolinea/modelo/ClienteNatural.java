package uniandes.dpoo.aerolinea.modelo;

public class ClienteNatural extends Cliente {
	public static final String NATURAL="Natural";
	private String nombre;
	public ClienteNatural(String nombre) {
		super(nombre);
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String getTipoCliente() {
		return NATURAL;
	}
	
	

}
