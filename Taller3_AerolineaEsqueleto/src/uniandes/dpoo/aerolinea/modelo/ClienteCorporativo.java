package uniandes.dpoo.aerolinea.modelo;



public class ClienteCorporativo extends Cliente {
	public static final String CORPORATIVO="Corporativo";
	public static final int GRANDE= 1;
	public static final int MEDIANO=2;
	public static final int PEQUENO=3;
	private String nombreEmpresa;
	private int tamanoEmpresa;
	public ClienteCorporativo(String nombreEmpresa, int tamanoEmpresa) {
		super(nombreEmpresa);
		this.nombreEmpresa = nombreEmpresa;
        this.tamanoEmpresa = tamanoEmpresa;
        	
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public int getTamanoEmpresa() {
		return tamanoEmpresa;
	}
	
	@Override
    public String getTipoCliente() {
        return CORPORATIVO;
    }
	
	
	
	

}
