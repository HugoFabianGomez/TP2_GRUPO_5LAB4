package ejercicio1;
import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciacion de Arrays para guardar la lista de Profesores
		ArrayList<Profesor> ListaProf = new ArrayList<Profesor>();
		
		//	Creo los Objetos de Profesor para cargar los difernetes datos
		Profesor prof1 = new Profesor();
		prof1.setNombre("Hugo Gomez");
		prof1.setEdad(35);
		prof1.setCargo("Profesor Titular");
		prof1.setAntiguedadDocente(80);
		ListaProf.add(prof1);	//	Guardo el objeto en el ArraysList

		Profesor prof2 = new Profesor();
		prof2.setNombre("Pablo Echarri");
		prof2.setEdad(40);
		prof2.setCargo("Profesor Adjunto");
		prof2.setAntiguedadDocente(70);
		ListaProf.add(prof2);
		
		Profesor prof3 = new Profesor("Gustavo Garzon", 33, "Ayudante de Catedra", 120);
		ListaProf.add(prof3);
		Profesor prof4 = new Profesor("Alejandro Fantino", 56, "Jefe de Trabajo Practico", 120);
		ListaProf.add(prof4);
		Profesor prof5 = new Profesor("Victoria Onetto", 28, "Bibliotecaria", 100);
		ListaProf.add(prof5);

		ListIterator<Profesor> ListIter_Prof = ListaProf.listIterator();
		while(ListIter_Prof.hasNext()) {
			Profesor profesor = ListIter_Prof.next();
			System.out.println(profesor.toString()+ "%");
		}		
	}
}