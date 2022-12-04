package Datos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Encargado {
	
	private String nombre;
	
	public Encargado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static Partido JugarPartido(Pais pais1, Pais pais2) {
		
		int tiempo = (int)(Math.random()*12) + 90;
		
		int golequipo1 = (int)(Math.random()*4);
		int golequipo2 = (int)(Math.random()*4);
		
		while ((golequipo1 == golequipo2)) {
			
			golequipo1 = (int)(Math.random()*4);
			golequipo2 = (int)(Math.random()*4);
			
		}
		
		//System.out.println("Goles "+pais1+ " = "+golequipo1+ " - "+ "Goles "+pais2+" = "+golequipo2+" - "+"Duracion: "+tiempo );
		
		pais1.setGoles(pais1.getGoles()+golequipo1);
		pais1.setGoles_contra(pais1.getGoles_contra()+golequipo2);
		pais1.setCantidadpartidos(pais1.getCantidadpartidos()+1);
		
		pais2.setGoles(pais2.getGoles()+golequipo2);
		pais2.setGoles_contra(pais2.getGoles_contra()+golequipo1);
		pais2.setCantidadpartidos(pais2.getCantidadpartidos()+1);
		
		
		
			 Partido partidojugado = new Partido(pais1,pais2,golequipo1,golequipo2,tiempo);
			 return partidojugado;
			
			 
	}
	
	public static void PreguntarNombre() {
	
		System.out.println("--------------------------------------------------");
		System.out.println("                                                  ");
		System.out.println("      Bienvenido al Programa del Mundial          ");
		System.out.println("   Porfavor Ingrese su nombre a continuacion...   ");
		System.out.println("                                                  ");
		System.out.println("--------------------------------------------------");

		String nombre_encargado = JOptionPane.showInputDialog("Ingrese su nombre");
		Encargado encargado = new Encargado(nombre_encargado);

		System.out.println("                                                     ");
		System.out.println("    Bienvenid@ "+nombre_encargado+", disfrute el Programa");
		System.out.println("                                                     ");


		
	}
	
	public static void DeterminarGanador32(Pais pais1,Pais pais2,Pais pais3,Pais pais4) {
		
		/* 01 */if (pais1.getGoles() >= pais2.getGoles() && pais2.getGoles() >= pais3.getGoles() && pais3.getGoles() >= pais4.getGoles()) {
			pais1.setLeaderboard(1); pais2.setLeaderboard(2); pais3.setLeaderboard(3); pais4.setLeaderboard(4);
		/* 02 */} else if (pais1.getGoles() >= pais2.getGoles() && pais2.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais3.getGoles()){
			pais1.setLeaderboard(1); pais2.setLeaderboard(2); pais4.setLeaderboard(3); pais3.setLeaderboard(4);
		/* 03 */} else if (pais1.getGoles() >= pais3.getGoles() && pais3.getGoles() >= pais2.getGoles() && pais2.getGoles() >= pais4.getGoles()){
			pais1.setLeaderboard(1); pais3.setLeaderboard(2); pais2.setLeaderboard(3); pais4.setLeaderboard(4);
		/* 04 */} else if (pais1.getGoles() >= pais3.getGoles() && pais3.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais2.getGoles()){
			pais1.setLeaderboard(1); pais3.setLeaderboard(2); pais4.setLeaderboard(3); pais2.setLeaderboard(4);
		/* 05 */} else if (pais1.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais2.getGoles() && pais2.getGoles() >= pais3.getGoles()){
			pais1.setLeaderboard(1); pais4.setLeaderboard(2); pais2.setLeaderboard(3); pais3.setLeaderboard(4);
		/* 06 */} else if (pais1.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais3.getGoles() && pais3.getGoles() >= pais2.getGoles()){
			pais1.setLeaderboard(1); pais4.setLeaderboard(2); pais3.setLeaderboard(3); pais2.setLeaderboard(4);
			
		/* 07 */} else if (pais2.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais3.getGoles() && pais3.getGoles() >= pais4.getGoles()){
			pais2.setLeaderboard(1); pais1.setLeaderboard(2); pais3.setLeaderboard(3); pais4.setLeaderboard(4);
		/* 08 */} else if (pais2.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais3.getGoles()){
			pais2.setLeaderboard(1); pais1.setLeaderboard(2); pais4.setLeaderboard(3); pais3.setLeaderboard(4);
		/* 09 */} else if (pais2.getGoles() >= pais3.getGoles() && pais3.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais4.getGoles()){
			pais2.setLeaderboard(1); pais3.setLeaderboard(2); pais1.setLeaderboard(3); pais4.setLeaderboard(4);
		/* 10 */} else if (pais2.getGoles() >= pais3.getGoles() && pais3.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais1.getGoles()){
			pais2.setLeaderboard(1); pais3.setLeaderboard(2); pais4.setLeaderboard(3); pais1.setLeaderboard(4);
		/* 11 */} else if (pais2.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais3.getGoles()){
			pais2.setLeaderboard(1); pais4.setLeaderboard(2); pais1.setLeaderboard(3); pais3.setLeaderboard(4);
		/* 12 */} else if (pais2.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais3.getGoles() && pais3.getGoles() >= pais1.getGoles()){
			pais2.setLeaderboard(1); pais4.setLeaderboard(2); pais3.setLeaderboard(3); pais1.setLeaderboard(4);
		
		/* 13 */} else if (pais3.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais2.getGoles() && pais2.getGoles() >= pais4.getGoles()){
			pais3.setLeaderboard(1); pais1.setLeaderboard(2); pais2.setLeaderboard(3); pais4.setLeaderboard(4);
		/* 14 */} else if (pais3.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais2.getGoles()){
			pais3.setLeaderboard(1); pais1.setLeaderboard(2); pais4.setLeaderboard(3); pais2.setLeaderboard(4);
		/* 15 */} else if (pais3.getGoles() >= pais2.getGoles() && pais2.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais4.getGoles()){
			pais3.setLeaderboard(1); pais2.setLeaderboard(2); pais1.setLeaderboard(3); pais4.setLeaderboard(4);
		/* 16 */} else if (pais3.getGoles() >= pais2.getGoles() && pais2.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais1.getGoles()){
			pais3.setLeaderboard(1); pais2.setLeaderboard(2); pais4.setLeaderboard(3); pais1.setLeaderboard(4);
		/* 17 */} else if (pais3.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais2.getGoles()){
			pais3.setLeaderboard(1); pais4.setLeaderboard(2); pais1.setLeaderboard(3); pais2.setLeaderboard(4);
		/* 18 */} else if (pais3.getGoles() >= pais4.getGoles() && pais4.getGoles() >= pais2.getGoles() && pais2.getGoles() >= pais1.getGoles()){
			pais3.setLeaderboard(1); pais4.setLeaderboard(2); pais2.setLeaderboard(3); pais1.setLeaderboard(4);
		
		/* 19 */} else if (pais4.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais2.getGoles() && pais2.getGoles() >= pais3.getGoles()){
			pais4.setLeaderboard(1); pais1.setLeaderboard(2); pais2.setLeaderboard(3); pais3.setLeaderboard(4);
		/* 20 */} else if (pais4.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais3.getGoles() && pais3.getGoles() >= pais2.getGoles()){
			pais4.setLeaderboard(1); pais1.setLeaderboard(2); pais3.setLeaderboard(3); pais2.setLeaderboard(4);
		/* 21 */} else if (pais4.getGoles() >= pais2.getGoles() && pais2.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais3.getGoles()){
			pais4.setLeaderboard(1); pais2.setLeaderboard(2); pais1.setLeaderboard(3); pais3.setLeaderboard(4);
		/* 22 */} else if (pais4.getGoles() >= pais2.getGoles() && pais2.getGoles() >= pais3.getGoles() && pais3.getGoles() >= pais1.getGoles()){
			pais4.setLeaderboard(1); pais2.setLeaderboard(2); pais3.setLeaderboard(3); pais1.setLeaderboard(4);
		/* 23 */} else if (pais4.getGoles() >= pais3.getGoles() && pais3.getGoles() >= pais1.getGoles() && pais1.getGoles() >= pais2.getGoles()){
			pais4.setLeaderboard(1); pais3.setLeaderboard(2); pais1.setLeaderboard(3); pais2.setLeaderboard(4);
		/* 24 */} else {
			pais4.setLeaderboard(1); pais3.setLeaderboard(2); pais2.setLeaderboard(3); pais1.setLeaderboard(4);
				}
		
		if (pais1.getLeaderboard() == 3 || pais1.getLeaderboard()== 4){
			pais1.setCalificado(false);
		}
		if (pais2.getLeaderboard() == 3 || pais2.getLeaderboard()== 4){
			pais2.setCalificado(false);
		}
		if (pais3.getLeaderboard() == 3 || pais3.getLeaderboard()== 4){
			pais3.setCalificado(false);
		}
		if (pais4.getLeaderboard() == 3 || pais4.getLeaderboard()== 4){
			pais4.setCalificado(false);
		}
		/*
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Nombre: "+pais1.getNombre()+" - "+" Goles: "+pais1.getGoles()+" - "+"Posicion: "+pais1.getLeaderboard()+" - "+"Calificado = "+pais1.isCalificado());
		System.out.println("Nombre: "+pais1.getNombre()+" - "+" Goles: "+pais1.getGoles()+" - "+"Posicion: "+pais1.getLeaderboard()+" - "+"Calificado = "+pais1.isCalificado()); 
		System.out.println("Nombre: "+pais1.getNombre()+" - "+" Goles: "+pais1.getGoles()+" - "+"Posicion: "+pais1.getLeaderboard()+" - "+"Calificado = "+pais1.isCalificado());
		System.out.println("Nombre: "+pais1.getNombre()+" - "+" Goles: "+pais1.getGoles()+" - "+"Posicion: "+pais1.getLeaderboard()+" - "+"Calificado = "+pais1.isCalificado());
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
	*/
	}
	
	public static void AvanzarGanador32(LinkedList<Pais>pais32,LinkedList<Pais>pais16) {
		
		
		DeterminarGanador32(pais32.get(0),pais32.get(1),pais32.get(2),pais32.get(3));
		DeterminarGanador32(pais32.get(4),pais32.get(5),pais32.get(6),pais32.get(7));
		DeterminarGanador32(pais32.get(8),pais32.get(9),pais32.get(10),pais32.get(11));
		DeterminarGanador32(pais32.get(12),pais32.get(13),pais32.get(14),pais32.get(15));
		DeterminarGanador32(pais32.get(16),pais32.get(17),pais32.get(18),pais32.get(19));
		DeterminarGanador32(pais32.get(20),pais32.get(21),pais32.get(22),pais32.get(23));
		DeterminarGanador32(pais32.get(24),pais32.get(25),pais32.get(26),pais32.get(27));
		DeterminarGanador32(pais32.get(28),pais32.get(29),pais32.get(30),pais32.get(31));

		for (Pais pais : pais32) {
			
			
			if (pais.isCalificado()) {
				pais16.add(pais);
				//System.out.println("Pais Agregado a Pais16 Exitosamente");
			}
		
			
		}
		
	}
	
	public static void DeterminarGanador16(LinkedList<Partido>partido16) {
		
		for (Partido partido : partido16) {
			
			if (partido.getGoles1()>partido.getGoles2()) {
				partido.getTeam2().setCalificado(false);
				//System.out.println("Ganador del Partido el equipo 1 = "+partido.getTeam1().getNombre());
			} else /*if (partido.getGoles2()>partido.getGoles1())*/{
				partido.getTeam1().setCalificado(false);
				//System.out.println("Ganador del Partido el equipo 2 = "+partido.getTeam2().getNombre());
			}
		}
 }	
	
	public static void AvanzarGanador16(LinkedList<Pais>pais16,LinkedList<Partido>partido16,LinkedList<Pais>pais8) {
		
		DeterminarGanador16(partido16);
		
		for (Pais pais : pais16) {
			if (pais.isCalificado()) {
				pais8.add(pais);
			}
		}
		
	}
	
	public static void DeterminarGanador8(LinkedList<Partido>partido8) {
		
		for (Partido partido : partido8) {
			
			if (partido.getGoles1()>partido.getGoles2()) {
				partido.getTeam2().setCalificado(false);
				//System.out.println("Ganador del Partido el equipo 1 = "+partido.getTeam1().getNombre());
			} else /*if (partido.getGoles2()>partido.getGoles1())*/{
				partido.getTeam1().setCalificado(false);
				//System.out.println("Ganador del Partido el equipo 2 = "+partido.getTeam2().getNombre());
			}
		}

		
	}

	public static void AvanzarGanador8(LinkedList<Pais>pais8,LinkedList<Partido>partido8,LinkedList<Pais>pais4) {
		
		DeterminarGanador8(partido8);
		
		for (Pais pais : pais8) {
			if (pais.isCalificado()) {
				pais4.add(pais);
			}
		}

		
	}
	
	public static void DeterminarGanador4(LinkedList<Partido>partido4) {
		
		for (Partido partido : partido4) {
			
			if (partido.getGoles1()>partido.getGoles2()) {
				partido.getTeam2().setCalificado(false);
				//System.out.println("Ganador del Partido el equipo 1 = "+partido.getTeam1().getNombre());
			} else /*if (partido.getGoles2()>partido.getGoles1())*/{
				partido.getTeam1().setCalificado(false);
				//System.out.println("Ganador del Partido el equipo 2 = "+partido.getTeam2().getNombre());
			}
		}

		
	}

	public static void AvanzarGanador4(LinkedList<Pais>pais4,LinkedList<Partido>partido4,LinkedList<Pais>pais2) {
		
		DeterminarGanador4(partido4);
		
		for (Pais pais : pais4) {
			if (pais.isCalificado()) {
				pais2.add(pais);
			}
		}
		
	}

	public static void DeterminarGanador2(LinkedList<Partido>partido2) {
		
		for (Partido partido : partido2) {
			
			if (partido.getGoles1()>partido.getGoles2()) {
				partido.getTeam2().setCalificado(false);
				//System.out.println("Ganador del Partido el equipo 1 = "+partido.getTeam1().getNombre());
			} else /*if (partido.getGoles2()>partido.getGoles1())*/{
				partido.getTeam1().setCalificado(false);
				//System.out.println("Ganador del Partido el equipo 2 = "+partido.getTeam2().getNombre());
			}
		}

		
	}
	
	public static void AvanzarGanador2(LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1) {
		
		DeterminarGanador2(partido2);
		
		for (Pais pais : pais2) {
			if (pais.isCalificado()) {
				pais1.add(pais);
			}
		}
	}
}

