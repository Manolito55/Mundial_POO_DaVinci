package Datos;

import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Partido {
	
	private Pais team1;
	private Pais team2;
	private int goles1;
	private int goles2;
	private int duracion;
	
	
	public Partido( Pais team1, Pais team2, int goles1, int goles2, int duracion) {
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
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Partido [team1=" + team1 + ", team2=" + team2 + ", goles1=" + goles1 + ", goles2=" + goles2
				+ ", duracion=" + duracion + "]";
	}

	public static void MostrarListaPartidos(LinkedList<Partido> lista) {
		String mostrar="";
		for (Partido partido : lista) {
			System.out.println("-----------------------------------------");
			System.out.println("ID: "+(lista.indexOf(partido)+1));
			System.out.println("Equipo 1: "+ partido.getTeam1().getNombre()+" - "+ "Goles: "+ partido.getGoles1());
			System.out.println("Equipo 2: "+ partido.getTeam2().getNombre()+" - "+ "Goles: "+partido.getGoles2());
			System.out.println("Duracion del Partido: "+partido.getDuracion());
			mostrar = mostrar + "ID: "+(lista.indexOf(partido)+1) + "\n Equipo 1: "+ partido.getTeam1().getNombre()+" - "+ "\n Goles: "+ partido.getGoles1() + "Equipo 2: "+ partido.getTeam2().getNombre()+" - "+ "Goles: "+partido.getGoles2() ;
	
			
		}
		
		JOptionPane.showMessageDialog(null, mostrar);
		
	}

	public static void CargarPartidos32(LinkedList<Pais>paises,LinkedList<Partido>partidos) { // Fase de Grupos
		
		//Lista de Partidos
		
		//Grupo A
	
		partidos.add(Encargado.JugarPartido(paises.get(0),paises.get(1)));
		partidos.add(Encargado.JugarPartido(paises.get(2),paises.get(3)));
		partidos.add(Encargado.JugarPartido(paises.get(0),paises.get(2)));
		partidos.add(Encargado.JugarPartido(paises.get(3),paises.get(1)));
		partidos.add(Encargado.JugarPartido(paises.get(3),paises.get(0)));
		partidos.add(Encargado.JugarPartido(paises.get(1),paises.get(2)));
		
		//Grupo B
		
		partidos.add(Encargado.JugarPartido(paises.get(4),paises.get(5)));
		partidos.add(Encargado.JugarPartido(paises.get(6),paises.get(7)));
		partidos.add(Encargado.JugarPartido(paises.get(4),paises.get(6)));
		partidos.add(Encargado.JugarPartido(paises.get(7),paises.get(5)));
		partidos.add(Encargado.JugarPartido(paises.get(7),paises.get(4)));
		partidos.add(Encargado.JugarPartido(paises.get(5),paises.get(6)));
		
		//Grupo C
		
		partidos.add(Encargado.JugarPartido(paises.get(8),paises.get(9)));
		partidos.add(Encargado.JugarPartido(paises.get(10),paises.get(11)));
		partidos.add(Encargado.JugarPartido(paises.get(8),paises.get(10)));
		partidos.add(Encargado.JugarPartido(paises.get(11),paises.get(9)));
		partidos.add(Encargado.JugarPartido(paises.get(11),paises.get(8)));
		partidos.add(Encargado.JugarPartido(paises.get(9),paises.get(10)));
		
		//Grupo D
		
		partidos.add(Encargado.JugarPartido(paises.get(12),paises.get(13)));
		partidos.add(Encargado.JugarPartido(paises.get(14),paises.get(15)));
		partidos.add(Encargado.JugarPartido(paises.get(12),paises.get(14)));
		partidos.add(Encargado.JugarPartido(paises.get(15),paises.get(13)));
		partidos.add(Encargado.JugarPartido(paises.get(15),paises.get(12)));
		partidos.add(Encargado.JugarPartido(paises.get(13),paises.get(14)));
		
		//Grupo E
		
		partidos.add(Encargado.JugarPartido(paises.get(16),paises.get(17)));
		partidos.add(Encargado.JugarPartido(paises.get(18),paises.get(19)));
		partidos.add(Encargado.JugarPartido(paises.get(16),paises.get(18)));
		partidos.add(Encargado.JugarPartido(paises.get(19),paises.get(17)));
		partidos.add(Encargado.JugarPartido(paises.get(19),paises.get(16)));
		partidos.add(Encargado.JugarPartido(paises.get(17),paises.get(18)));
		
		//Grupo F
		
		partidos.add(Encargado.JugarPartido(paises.get(20),paises.get(21)));
		partidos.add(Encargado.JugarPartido(paises.get(22),paises.get(23)));
		partidos.add(Encargado.JugarPartido(paises.get(20),paises.get(22)));
		partidos.add(Encargado.JugarPartido(paises.get(23),paises.get(21)));
		partidos.add(Encargado.JugarPartido(paises.get(23),paises.get(20)));
		partidos.add(Encargado.JugarPartido(paises.get(21),paises.get(22)));
		
		//Grupo G
		
		partidos.add(Encargado.JugarPartido(paises.get(24),paises.get(25)));
		partidos.add(Encargado.JugarPartido(paises.get(26),paises.get(27)));
		partidos.add(Encargado.JugarPartido(paises.get(24),paises.get(26)));
		partidos.add(Encargado.JugarPartido(paises.get(27),paises.get(25)));
		partidos.add(Encargado.JugarPartido(paises.get(27),paises.get(24)));
		partidos.add(Encargado.JugarPartido(paises.get(25),paises.get(26)));
		
		//Grupo H
		
		partidos.add(Encargado.JugarPartido(paises.get(28),paises.get(29)));
		partidos.add(Encargado.JugarPartido(paises.get(30),paises.get(31)));
		partidos.add(Encargado.JugarPartido(paises.get(28),paises.get(30)));
		partidos.add(Encargado.JugarPartido(paises.get(31),paises.get(29)));
		partidos.add(Encargado.JugarPartido(paises.get(31),paises.get(28)));
		partidos.add(Encargado.JugarPartido(paises.get(29),paises.get(30)));

		
	}
	
	public static void CargarPartidos16(LinkedList<Pais>paises16,LinkedList<Partido>partidos16) { // Octavos de Final
		
		partidos16.add(Encargado.JugarPartido(paises16.get(0),paises16.get(3)));
		partidos16.add(Encargado.JugarPartido(paises16.get(1),paises16.get(2)));
		partidos16.add(Encargado.JugarPartido(paises16.get(4),paises16.get(7)));
		partidos16.add(Encargado.JugarPartido(paises16.get(5),paises16.get(6)));
		partidos16.add(Encargado.JugarPartido(paises16.get(8),paises16.get(11)));
		partidos16.add(Encargado.JugarPartido(paises16.get(9),paises16.get(10)));
		partidos16.add(Encargado.JugarPartido(paises16.get(12),paises16.get(15)));
		partidos16.add(Encargado.JugarPartido(paises16.get(13),paises16.get(14)));
	
	}

	public static void CargarPartidos8(LinkedList<Pais>pais8,LinkedList<Partido>partido8) { // Cuartos de Final
		
		partido8.add(Encargado.JugarPartido(pais8.get(0),pais8.get(1)));
		partido8.add(Encargado.JugarPartido(pais8.get(2),pais8.get(3)));
		partido8.add(Encargado.JugarPartido(pais8.get(4),pais8.get(5)));
		partido8.add(Encargado.JugarPartido(pais8.get(6),pais8.get(7)));


	}

	public static void CargarPartidos4(LinkedList<Pais>pais4,LinkedList<Partido>partido4) { // Semi Final
		
		partido4.add(Encargado.JugarPartido(pais4.get(0),pais4.get(1)));
		partido4.add(Encargado.JugarPartido(pais4.get(2),pais4.get(3)));
		
	}
	
	public static void CargarPartidos2(LinkedList<Pais>pais2,LinkedList<Partido>partido2) { // Final
		partido2.add(Encargado.JugarPartido(pais2.get(0),pais2.get(1)));
	}
}

	
	
	
