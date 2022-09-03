package ejercicio3;

public class InstalacionPolideportivo implements Instalacion {

	private String Nombre;
	private InstalacionDeportiva insdeportiva;
	private InstalacionEdificio insedificio;
	
	public InstalacionPolideportivo() {	
	}
	
	public InstalacionPolideportivo(String Nombre, InstalacionDeportiva insdeportiva, InstalacionEdificio insedificio) {
		this.Nombre = Nombre;
		this.insdeportiva=insdeportiva;
		this.insedificio=insedificio;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public InstalacionDeportiva getInsdeportiva() {
		return insdeportiva;
	}

	public void setInsdeportiva(InstalacionDeportiva insdeportiva) {
		this.insdeportiva = insdeportiva;
	}

	public InstalacionEdificio getInsedificio() {
		return insedificio;
	}

	public void setInsedificio(InstalacionEdificio insedificio) {
		this.insedificio = insedificio;
	}

	@Override
	public String toString() {
		return "InsPolideportivo [ Nombre=" + Nombre + ", insdeportiva=" + insdeportiva + ", insedificio=" + insedificio + "]";
	}
}
