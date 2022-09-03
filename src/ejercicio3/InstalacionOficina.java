package ejercicio3;

public class InstalacionOficina implements Instalacion {
	
	private int CantOficina;
	
	public InstalacionOficina() {
		
	}
	
	public InstalacionOficina(int CantOficina) {
		super();
		this.CantOficina = CantOficina;
	}
	
	public int getCantOficina() {
		return CantOficina;
	}

	public void setCantOficina(int cantOficina) {
		this.CantOficina = cantOficina;
	}

	@Override
	public String toString() {
		return "InsOficina [CantOficina=" + CantOficina + "]";
	}
}
