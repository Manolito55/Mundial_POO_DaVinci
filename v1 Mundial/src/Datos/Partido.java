package Datos;

public class Partido {
	
	private int id;
	private Pais team1;
	private Pais team2;
	private int goles1;
	private int goles2;
	private double duracion;
	
	public Partido(int id, Pais team1, Pais team2, int goles1, int goles2, double duracion) {
		super();
		this.id = id;
		this.team1 = team1;
		this.team2 = team2;
		this.goles1 = goles1;
		this.goles2 = goles2;
		this.duracion = duracion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	
}


	
	
	
