package Datos;

import javax.swing.JOptionPane;

public class Encargado {
	
	public static Partido JugarPartido(Pais pais1, Pais pais2) {
		
		double tiempo = (double)(Math.random()*8) + 90;
		
		
		
		int golequipo1 = (int)(Math.random()*4);
		int golequipo2 = (int)(Math.random()*4);
		
		while ((golequipo1 == golequipo2)) {
			
			golequipo1 = (int)(Math.random()*4);
			golequipo2 = (int)(Math.random()*4);
			
			
			
		}
			
		System.out.println("Goles team1 = "+golequipo1+ " - "+ "Goles team2 = "+golequipo2+" - "+"Duracion: "+tiempo );
		
			 Partido partidonuevo = new Partido(pais1,pais2,golequipo1,golequipo2,tiempo);
			 return partidonuevo;
			

	}
	

	
}
