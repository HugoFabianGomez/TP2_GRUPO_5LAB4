package ejercicio1;

import java.util.Objects;

public class Profesor extends Empleado implements Comparable<Empleado> {	//Hereda de Empleado y el Comparable es para usar el TreeSet
	
	//	Atributos
	private String cargo;
	private int antiguedadDocente;
	
	//Constructores
	public Profesor() {
		super();	//Atributos de Empleado
	}
	
	public Profesor(String nombre, int edad, String cargo, int antiguedad) {
		super(nombre, edad);
		this.cargo = cargo;
		this.antiguedadDocente = antiguedad;
		
	}
	
	// Getters y Setters de atributos propios de Profesor
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	// Función ToString()
	@Override
	public String toString() {
		return super.toString() + "\nCargo: " + cargo + "\nAntiguedad Docente: " + antiguedadDocente + "%\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(antiguedadDocente, cargo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		
		
		return  antiguedadDocente == other.antiguedadDocente && Objects.equals(cargo, other.cargo);
	}
	
	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		int Salida = -1;
		if(o.getNombre().compareTo(this.getNombre()) == 0 && o.getEdad() == this.getEdad()) {
			Salida =0;
			if(o.getEdad() < this.getEdad()) {
				Salida = -1;
				if(o.getEdad() > this.getEdad()) {
					Salida = 1;
				}
			}
			if(o.getNombre().compareTo(this.getNombre()) < 0) {
				Salida = -1;
				if(o.getNombre().compareTo(this.getNombre()) > 0) {
					Salida = 1;
				}
			}
		}
		return Salida;
	}
}
