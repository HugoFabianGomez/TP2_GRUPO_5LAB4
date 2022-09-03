package ejercicio3;

public class InstalacionDeportiva implements Instalacion {
	
	private int tipoDeInstalacion;
	
	public InstalacionDeportiva() {	
	}
	
	public InstalacionDeportiva(int tipoDeInstalacion) {
		super();
		this.setTipoDeInstalacion(tipoDeInstalacion);
	}
	
	//Setter y Getters
	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}

	@Override
	public String toString() {
		return "InsDeportiva [tipoDeInstalacion=" + tipoDeInstalacion + "]";
	}
}
