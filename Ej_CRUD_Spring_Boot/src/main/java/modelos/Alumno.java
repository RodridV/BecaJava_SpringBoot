package modelos;

public class Alumno {

	
	//Constructores
	public Alumno() {
		super();
	}
	
	public Alumno(int matricula) {
		super();
		this.matricula = matricula;
	}

	public Alumno(int matricula, String apellido, String nombre) {
		super();
		this.matricula = matricula;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	
	//Campos
	public int matricula; // PK
	public String apellido;
	public String nombre;
	public int getMatricula() {
		return matricula;
	}

	//Métodos
	//...toString
	@Override
	public String toString() {
		return "Alumno:\n"
				+"Nº de matricula: " + matricula+"\n"
				+ "Apellido: " + apellido+"\n"
				+ "Nombre: " + nombre+"\n";
	}

	//...getters y setters
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
}
