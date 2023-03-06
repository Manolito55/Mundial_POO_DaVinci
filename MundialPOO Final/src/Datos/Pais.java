package Datos;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Pais {

	private String nombre;
	private String grupo;
	private int goles,goles_contra,leaderboard;
	private int cantidadpartidos;
	private boolean calificado;
	
	public Pais(String nombre, String grupo, int goles, int goles_contra, int leaderboard, int cantidadpartidos,
			boolean calificado) {
		super();
		this.nombre = nombre;
		this.grupo = grupo;
		this.goles = goles;
		this.goles_contra = goles_contra;
		this.leaderboard = leaderboard;
		this.cantidadpartidos = cantidadpartidos;
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

	public int getGoles_contra() {
		return goles_contra;
	}

	public void setGoles_contra(int goles_contra) {
		this.goles_contra = goles_contra;
	}

	public int getLeaderboard() {
		return leaderboard;
	}

	public void setLeaderboard(int leaderboard) {
		this.leaderboard = leaderboard;
	}

	public int getCantidadpartidos() {
		return cantidadpartidos;
	}

	public void setCantidadpartidos(int cantidadpartidos) {
		this.cantidadpartidos = cantidadpartidos;
	}

	public boolean isCalificado() {
		return calificado;
	}

	public void setCalificado(boolean calificado) {
		this.calificado = calificado;
	}

	@Override
	public String toString() {
		return "Pais: " + nombre +" - "+"Grupo: " + grupo +" - "+" Goles: " + goles +" - "+"Goles en contra: " + goles_contra +
				" - "+"Partidos Jugados: " + cantidadpartidos +" - "+ "Calificado: "+ calificado;
	}

	public static void MostrarListaEquipos(LinkedList<Pais> lista) {
		
		
		for (Pais pais : lista) {
			
			System.out.println("----------------------------------");
			System.out.println("Nombre: "+ pais.getNombre()+" - "+"ID: "+lista.indexOf(pais)+" - "+"Calificado: "+pais.isCalificado());
			
			JOptionPane.showMessageDialog(null, "Nombre: "+ pais.getNombre()+" - "+"ID: "+lista.indexOf(pais)+" - "+"Calificado: "+pais.isCalificado());	
			
		}
		
	}
		
}

