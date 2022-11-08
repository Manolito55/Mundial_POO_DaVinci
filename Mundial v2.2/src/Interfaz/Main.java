package Interfaz;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import Datos.Encargado;
import Datos.Pais;
import Datos.Partido;

public class Main {
	//ANOTADOR DUDAS:

	public static void main(String[] args) {
	
		Encargado encargado = new Encargado("Emanuele");
		
		LinkedList<Pais> paises = new LinkedList<Pais>();
		
		LinkedList<Partido> partidos = new LinkedList<Partido>();
		
		// Cargado de los Equipos
		
		paises.add(new Pais("Qatar","a",0,0,true));
		paises.add(new Pais("Ecuador","a",0,0,true));
		paises.add(new Pais("Senegal","a",0,0,true));
		paises.add(new Pais("Netherlands","a",0,0,true));
		paises.add(new Pais("England","b",0,0,true));
		paises.add(new Pais("Iran","b",0,0,true));
		paises.add(new Pais("USA","b",0,0,true));
		paises.add(new Pais("Wales","b",0,0,true));
		paises.add(new Pais("Argentina","c",0,0,true));
		paises.add(new Pais("Saudi Arabia","c",0,0,true));
		paises.add(new Pais("Mexico","c",0,0,true));
		paises.add(new Pais("Poland","c",0,0,true));
		paises.add(new Pais("France","d",0,0,true));
		paises.add(new Pais("Australia","d",0,0,true));
		paises.add(new Pais("Denmark","d",0,0,true));
		paises.add(new Pais("Tunisia","d",0,0,true));
		paises.add(new Pais("Spain","e",0,0,true));
		paises.add(new Pais("Costa Rica","e",0,0,true));
		paises.add(new Pais("Germany","e",0,0,true));
		paises.add(new Pais("Japan","e",0,0,true));
		paises.add(new Pais("Belgium","f",0,0,true));
		paises.add(new Pais("Canada","f",0,0,true));
		paises.add(new Pais("Morocco","f",0,0,true));
		paises.add(new Pais("Croatia","f",0,0,true));
		paises.add(new Pais("Brazil","g",0,0,true));
		paises.add(new Pais("Serbia","g",0,0,true));
		paises.add(new Pais("Switzerland","g",0,0,true));
		paises.add(new Pais("Cameroon","g",0,0,true));
		paises.add(new Pais("Portugal","h",0,0,true));
		paises.add(new Pais("Ghana","h",0,0,true));
		paises.add(new Pais("Uruguay","h",0,0,true));
		paises.add(new Pais("Korea Republic","h",0,0,true));
		
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
			
			Pais.MostrarListaEquipos(paises);
			Partido.MostrarListaPartidos(partidos);
			
			
			
			
			
	} 
	//Termina Main
	
	
	
	
	
}
