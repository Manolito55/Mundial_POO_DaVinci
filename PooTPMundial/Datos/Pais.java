package Datos;

public class Pais {

	private String nombre;
	private String grupo;
	private int goles;
	private boolean calificado;
	
	
	public Pais(String nombre, String grupo, int goles, boolean calificado) {
		super();
		this.nombre = nombre;
		this.grupo = grupo;
		this.goles = goles;
		this.calificado = calificado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	public int getGoles() {
		return goles;
	}


	public void setGoles(int goles) {
		this.goles = goles;
	}


	public boolean isCalificado() {
		return calificado;
	}


	public void setCalificado(boolean calificado) {
		this.calificado = calificado;
	}
	
	

}

