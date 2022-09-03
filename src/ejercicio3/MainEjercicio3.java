package ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InstalacionPolideportivo Poli1 = new InstalacionPolideportivo();
		Poli1.setInsdeportiva(new InstalacionDeportiva(1));
		Poli1.setInsedificio(new InstalacionEdificio(1200.7));
		Poli1.setNombre("Belgrano");
		
		InstalacionPolideportivo Poli2 = new InstalacionPolideportivo("River Plate", new InstalacionDeportiva(1), new InstalacionEdificio(3200.8));
		InstalacionPolideportivo Poli3 = new InstalacionPolideportivo("Lanus", new InstalacionDeportiva(1), new InstalacionEdificio(8500.8));
		
		InstalacionOficina Edi1 = new InstalacionOficina();
		Edi1.setCantOficina(255);

		InstalacionOficina Edi2 = new InstalacionOficina(58);
		InstalacionOficina Edi3 = new InstalacionOficina(32);
		
		ArrayList<Instalacion>  Lista = new ArrayList<Instalacion>();
		Lista.add(Poli1);
		Lista.add(Poli2);
		Lista.add(Poli3);		
		Lista.add(Edi1);
		Lista.add(Edi2);
		Lista.add(Edi3);
				
		ListIterator<Instalacion> Listaiter = Lista.listIterator();
		while(Listaiter.hasNext()) {
			Instalacion instalacion = Listaiter.next();
			System.out.println(instalacion.toString());
		}
	}
}
