package ejercicio2;

import java.util.Date;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
			Date Fecha = new Date();
		
			ProductoFresco ProdFresco = new ProductoFresco();
			ProdFresco.setNumero_lote(1);
			ProdFresco.setFecha_caducidad(Fecha);
			ProdFresco.setFechaEnvasado(Fecha);
			ProdFresco.setPaisOrigen("Argentina");
			
			ProductoRefrigerado ProdRefrigerado = new ProductoRefrigerado();
			ProdRefrigerado.setNumero_lote(1);
			ProdRefrigerado.setFecha_caducidad(Fecha);
			ProdRefrigerado.setCodOrganismo("1234");
			
			ProductoCongelado ProdCongelado = new ProductoCongelado();
			ProdCongelado.setNumero_lote(1);
			ProdCongelado.setFecha_caducidad(Fecha);
			ProdCongelado.setTempRecomendada(5);
			
			System.out.println(ProdFresco.toString());
			System.out.println(ProdRefrigerado.toString());
			System.out.println(ProdCongelado.toString());
	}

}
