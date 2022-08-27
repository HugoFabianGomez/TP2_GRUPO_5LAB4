package ejercicio2;
import java.util.Date;

public class Producto {
	//Attributes
	private int numero_lote;
	private Date fecha_caducidad;
	
	//Constructors
	public Producto(){
		
	}
	
	public Producto(int numero_lote, Date fecha_caducidad) {
		this.numero_lote = numero_lote;
		this.fecha_caducidad = fecha_caducidad;
	}
	
	//Getters & Setters
	public int getNumero_lote() {
		return numero_lote;
	}
	public void setNumero_lote(int numero_lote) {
		this.numero_lote = numero_lote;
	}
	public Date getFecha_caducidad() {
		return fecha_caducidad;
	}
	public void setFecha_caducidad(Date fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	//Methods
	@Override
	public String toString() {
		return "Numero de lote: " + numero_lote + "\nFecha de caducidad:" + fecha_caducidad + "\n";
	}
	
	
	
	
}
