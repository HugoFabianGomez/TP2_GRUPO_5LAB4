package ejercicio3;

public class InstalacionEdificio {

	private double superficieEdificio;
	
	public  InstalacionEdificio() {
			
	}

	public InstalacionEdificio(double superficieEdificio) {
		super();
		this.superficieEdificio = superficieEdificio;
	}

	public void setSuperficieEdificio(double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}


	public double getSuperficieEdificio() {
		return superficieEdificio;
	}

	@Override
	public String toString() {
		return "instalacionEdificio [superficieEdificio=" + superficieEdificio + "]";
	}
	
}
