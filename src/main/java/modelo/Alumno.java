package modelo;

public class Alumno {
	
	
	// Atributos o Propiedades o Variables de Instancia
	private int id;
	private String nombre;
	private String carrera;
	
	// Constructores
	public Alumno() {
		super();
	}
	
	public Alumno(String nombre, String carrera) {
		super();
		this.nombre = nombre;
		this.carrera = carrera;
	}
	
	public Alumno(int id, String nombre, String carrera) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carrera = carrera;
	}
	
	//Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	

}
