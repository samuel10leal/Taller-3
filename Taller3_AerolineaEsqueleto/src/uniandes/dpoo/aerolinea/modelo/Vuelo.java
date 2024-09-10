package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.LinkedList;

public class Vuelo {
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private Collection<Tiquetes> tiquetes;
	public Vuelo(String fecha, Ruta ruta, Avion avion) {
		
		this.fecha = fecha;
		this.ruta = ruta;
		this.avion = avion;
		this.tiquetes = new LinkedList<>();
	}
	public String getFecha() {
		return fecha;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public Avion getAvion() {
		return avion;
	}
	public Collection<Tiquetes> getTiquetes() {
		return tiquetes;
	}
	public void agregarTiquetes(Tiquetes tiquetes) {
		this.tiquetes.add(tiquetes);
		
	}
	public int venderTiquetes(Cliente cliente,CalculadoraTarifas calculadora, int cantidad) {
		return calculadora;
	}
	
	
	
	

}
