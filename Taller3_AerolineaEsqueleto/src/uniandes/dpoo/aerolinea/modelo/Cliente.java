package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.HashSet;

public abstract class Cliente {
	
	private String identificador;
	private Collection<Tiquetes> listaTiquetes;
	public Cliente(String identificador) {
		
		this.identificador = identificador;
		this.listaTiquetes = new HashSet<>();
		
	}
	public String getIdentificador() {
		return identificador;
	}
	public Collection<Tiquetes> getListaTiquetes() {
		return listaTiquetes;
	}
	public void agregarTiquetes(Tiquetes tiquete) {
		listaTiquetes.add(tiquete);
	}
	public int calcularValorTotalTiquetes() {
		int total=0;
		for(Tiquetes tiquete:listaTiquetes) {
			total+=tiquete.getTarifa();
		}
		return total;
		
	}
	public void usarTiquetes(Vuelo vuelo) {
		for (Tiquetes tiquete:listaTiquetes) {
			if (tiquete.getVuelo().equals(vuelo) && !tiquete.isUsado()) {
				tiquete.marcarComoUsado();
			}
			
		}
		
	}
	
	public abstract  String getTipoCliente() ;
		
	
	
}
