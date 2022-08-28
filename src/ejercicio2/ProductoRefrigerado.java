package ejercicio2;

public class ProductoRefrigerado extends Producto{
	private String CodOrganismo; //Codigo del organismo de supervisión alimentaria.

    public ProductoRefrigerado() {
		
	}
	
    public ProductoRefrigerado(String codOrganismo) {
		this.CodOrganismo = codOrganismo;
	}

	public String getCodOrganismo() {
		return CodOrganismo;
	}

	public void setCodOrganismo(String codOrganismo) {
		CodOrganismo = codOrganismo;
	}
	
	@Override
	public String toString() {
	return super.toString()+ "\nCodigo del organismo de supervision alimentaria: " + CodOrganismo + "\n";
	}
}