package ejercicio2;

public class ProductoCongelado extends Producto{
	private int TempRecomendada; //Temperatura de congelación recomendada.

	public ProductoCongelado() {
		
	}
	
	public ProductoCongelado(int tempRecomendada) {
		this.TempRecomendada = tempRecomendada;
	}
	
	public int getTempRecomendada() {
		return TempRecomendada;
	}

	public void setTempRecomendada(int tempRecomendada) {
		TempRecomendada = tempRecomendada;
	}
	
	@Override
	public String toString() {
	return super.toString()+ "\nTemperatura de congelación recomendada: " + TempRecomendada + "°C" + "\n";
	}
}
