package Datos;

public class Encargado {
	
	public static void CrearPartido(Pais pais1,Pais pais2) {
		
		
		//Partido i = new Partido(,pais1,pais2,);
		
	}

	public static void JugarPartido() {
		
		int t = (int)(Math.random()*8) + 90;
		
		int a = (int)(Math.random()*4);
		int b = (int)(Math.random()*4);
		
		while ((a == b)) {
			
			a = (int)(Math.random()*4);
			b = (int)(Math.random()*4);
			
		}
		
		System.out.println("Goles team1 = "+a+ " - "+ "Goles team2 = "+b+" - "+"Duracion: "+t);

	}
	

	
}
