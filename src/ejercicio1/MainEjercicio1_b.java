package ejercicio1;
import java.util.TreeSet;
import java.util.Iterator;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Profesor> TreeSetProf = new TreeSet<Profesor>();
		
		Profesor prof1 = new Profesor("Rogelio Funesmori", 35, "Profesor de Educacion Fisica", 10);
		TreeSetProf.add(prof1);
		Profesor prof2 = new Profesor("Freddy Mercury", 57, "Profesor de Musica", 30);
		TreeSetProf.add(prof2);
		Profesor prof3 = new Profesor("Carlos Tevez", 38, "Ayudante de gimnasio", 20);
		TreeSetProf.add(prof3);
		Profesor prof4 = new Profesor("Viviana Canosa", 46, "Profesora de Periodismo", 17);
		TreeSetProf.add(prof4);
		Profesor prof5 = new Profesor("Andrea Bocelli", 61, "Ayudante de estudio", 40);
		TreeSetProf.add(prof5);
		
		Iterator<Profesor> Iter_Prof = TreeSetProf.iterator();
		
		while(Iter_Prof.hasNext()) {
			Profesor profesor = Iter_Prof.next();
			System.out.println(profesor.toString());
		}
		
		Profesor prof6 = new Profesor("Mariano Martinez", 47, "Profesor de Baile", 20);
		Profesor prof7 = new Profesor("Mariano Martinez", 47, "Profesor de Baile", 20);
		
		if(prof6.equals(prof7)) {
			System.out.println("\nEs el mismo profesor");
		}
		else {
			System.out.println("\nSon profesores diferentes");
		}

	}

}
