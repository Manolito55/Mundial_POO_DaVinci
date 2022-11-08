package Datos;

import javax.swing.JOptionPane;

public class Encargado {
	
	private String nombre;
	
	
	
	public Encargado(String nombre) {
		super();
		this.nombre = nombre;
	}



	public static Partido JugarPartido(Pais pais1, Pais pais2) {
		
		double tiempo = (double)(Math.random()*8) + 90;
		
		
		
		int golequipo1 = (int)(Math.random()*4);
		int golequipo2 = (int)(Math.random()*4);
		
		while ((golequipo1 == golequipo2)) {
			
			golequipo1 = (int)(Math.random()*4);
			golequipo2 = (int)(Math.random()*4);
			
			
			
		}
			
		System.out.println("Goles "+pais1+ " = "+golequipo1+ " - "+ "Goles "+pais2+" = "+golequipo2+" - "+"Duracion: "+tiempo );
		
			 Partido partidonuevo = new Partido(pais1,pais2,golequipo1,golequipo2,tiempo);
			 return partidonuevo;
			

	}
	

	
}
