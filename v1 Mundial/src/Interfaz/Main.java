package Interfaz;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import Datos.Encargado;
import Datos.Pais;
import Datos.Partido;

public class Main {
	
	

	public static void main(String[] args) {
	

		
		LinkedList<Pais> paises = new LinkedList<Pais>();
		
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
		
	
		
		/*
		for (Pais pais : paises) {
			System.out.println("Nombre: "+ pais.getNombre());
		}
		
		String nombrepais="Qatar";
		
		for (Pais pais : paises) {
			if(pais.getNombre().equals(nombrepais)) {
				System.out.println("Encontr el pais Nombre: "+ pais.getNombre());
				pais.setCantidadpartidos(pais.getCantidadpartidos()+1);
				
			}
		}
		
		*/
		
		MostrarListaEquipos(paises);
		Encargado.JugarPartido();
		ModificarListaEquipos(paises);
	} //Termina Main
	
	
	
	// Metodos de Listas
	
	public static void MostrarListaEquipos(LinkedList<Pais> lista) {
		
		for (Pais pais : lista) {
			System.out.println("Nombre: "+ pais.getNombre());
		}
		
	}
	
	
	
	
	public static void ModificarListaEquipos(LinkedList<Pais> lista) {
		
		String nombrepais = JOptionPane.showInputDialog("Ingrese el nombre del Equipo");
		
		for (Pais pais : lista) {
			if(pais.getNombre().equals(nombrepais)) {
				System.out.println("Encontre el pais Nombre: "+ pais.getNombre());
				pais.setCantidadpartidos(pais.getCantidadpartidos()+1);
				
			}
		}
		
	}
	
	/*
	Pais p1 = new Pais("Qatar",,0,false);
	Pais p2 = new Pais();
	Pais p3 = new Pais();
	Pais p4 = new Pais();
	Pais p5 = new Pais();
	Pais p6 = new Pais();
	Pais p7 = new Pais();
	Pais p8 = new Pais();
	Pais p9 = new Pais();
	Pais p10 = new Pais();
	Pais p11 = new Pais();
	Pais p12 = new Pais();
	Pais p13 = new Pais();
	Pais p14 = new Pais();
	Pais p15 = new Pais();
	Pais p16 = new Pais();
	Pais p17 = new Pais();
	Pais p18 = new Pais();
	Pais p19 = new Pais();
	Pais p20 = new Pais();
	Pais p21 = new Pais();
	Pais p22 = new Pais();
	Pais p23 = new Pais();
	Pais p24 = new Pais();
	Pais p25 = new Pais();
	Pais p26 = new Pais();
	Pais p27 = new Pais();
	Pais p28 = new Pais();
	Pais p29 = new Pais();
	Pais p30 = new Pais();
	Pais p31 = new Pais();
	Pais p32 = new Pais();
	*/
	
}
