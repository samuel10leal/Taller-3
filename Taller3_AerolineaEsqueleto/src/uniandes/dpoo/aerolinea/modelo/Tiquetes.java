package uniandes.dpoo.aerolinea.modelo;

public class Tiquetes {
	private String codigo;
	private Vuelo vuelo;
	private Cliente cliente;
	private int tarifa;
	private boolean usado; 
	
	public Tiquetes(String codigo, Vuelo vuelo, Cliente cliente, int tarifa) {
		this.codigo=codigo;
		this.vuelo = vuelo;
        this.cliente = cliente;
        this.tarifa = tarifa;
        this.usado = false;
	}
	public String getcodigo() {
		return codigo;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getTarifa() {
		return tarifa;
	}

	public boolean isUsado() {
		return usado;
	}
	
	public void marcarComoUsado() {
		this.usado= true;
		
	}
}
