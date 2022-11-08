package Datos;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Partido {
	
	private Pais team1;
	private Pais team2;
	private int goles1;
	private int goles2;
	private double duracion;
	
	
	public Partido( Pais team1, Pais team2, int goles1, int goles2, double duracion) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.goles1 = goles1;
		this.goles2 = goles2;
		this.duracion = duracion;
	}
	
	public Pais getTeam1() {
		return team1;
	}
	public void setTeam1(Pais team1) {
		this.team1 = team1;
	}
	public Pais getTeam2() {
		return team2;
	}
	public void setTeam2(Pais team2) {
		this.team2 = team2;
	}
	public int getGoles1() {
		return goles1;
	}
	public void setGoles1(int goles1) {
		this.goles1 = goles1;
	}
	public int getGoles2() {
		return goles2;
	}
	public void setGoles2(int goles2) {
		this.goles2 = goles2;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
public static void MostrarListaPartidos(LinkedList<Partido> lista) {
		
		for (Partido partido : lista) {
			System.out.println("-----------------------------------------");
			System.out.println("ID: "+(lista.indexOf(partido)+1));
			System.out.println("Equipo 1: "+ partido.getTeam1()+" - "+ "Goles: "+ partido.getGoles1());
			System.out.println("Equipo 2: "+ partido.getTeam2()+" - "+ "Goles: "+partido.getGoles2());
			System.out.println("Duracion del Partido: "+partido.getDuracion());
			
		}
		
	}

public static void ModificarListaPartidos(LinkedList<Partido> lista) { //INCOMPLETO
	
	String nombrepais = JOptionPane.showInputDialog("Ingrese el nombre del Equipo");
	
	for (Partido partido : lista) {
		
			
		
		}
	}
	
}


	
	
	
