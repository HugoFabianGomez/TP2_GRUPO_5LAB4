package ejercicio2;
import java.util.Date;

public class ProductoFresco extends Producto{
	private Date FechaEnvasado;
	private String PaisOrigen;
	
    public ProductoFresco() {
		
	}
    
    public ProductoFresco(Date fechaEnvasado, String paisOrigen) {
		this.FechaEnvasado = fechaEnvasado;
		this.PaisOrigen = paisOrigen;
	}
	
	public Date getFechaEnvasado() {
		return FechaEnvasado;
	}
	public void setFechaEnvasado(Date fechaEnvasado) {
		FechaEnvasado = fechaEnvasado;
	}
	public String getPaisOrigen() {
		return PaisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		PaisOrigen = paisOrigen;
	}
	
	@Override
	public String toString() {
	return super.toString()+ "\nFecha de envasado: " + FechaEnvasado + "\nPais de origen: " + PaisOrigen + "\n";
	}
}
