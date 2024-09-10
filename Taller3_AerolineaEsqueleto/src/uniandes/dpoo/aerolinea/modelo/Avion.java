package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	private String nombre;
	private int capacidad;
	
	public Avion(String nombre, int capacidad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
	}

}
