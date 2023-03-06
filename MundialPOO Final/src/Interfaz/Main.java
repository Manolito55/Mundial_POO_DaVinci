package Interfaz;

import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Datos.Encargado;
import Datos.Pais;
import Datos.Partido;


public class Main {
	//ANOTADOR DUDAS:

	public static void main(String[] args) {
		
		// Cargado de Listas
		
		LinkedList<Pais> paises = new LinkedList<Pais>();
		LinkedList<Pais> paises16 = new LinkedList<Pais>();
		LinkedList<Pais> paises8 = new LinkedList<Pais>();
		LinkedList<Pais> paises4 = new LinkedList<Pais>();
		LinkedList<Pais> paises2 = new LinkedList<Pais>();
		LinkedList<Pais> paises1 = new LinkedList<Pais>();
		
		LinkedList<Pais> paisesManual32 = new LinkedList<Pais>();
		LinkedList<Pais> paisesManual16 = new LinkedList<Pais>();
		LinkedList<Pais> paisesManual8 = new LinkedList<Pais>();
		LinkedList<Pais> paisesManual4 = new LinkedList<Pais>();
		LinkedList<Pais> paisesManual2 = new LinkedList<Pais>();
		LinkedList<Pais> paisesManual1 = new LinkedList<Pais>();
		
		LinkedList<Partido> partidos = new LinkedList<Partido>();
		LinkedList<Partido> partidos16 = new LinkedList<Partido>();
		LinkedList<Partido> partidos8 = new LinkedList<Partido>();
		LinkedList<Partido> partidos4 = new LinkedList<Partido>();
		LinkedList<Partido> partidos2 = new LinkedList<Partido>();
		
		
		// Cargado de los Equipos
		
		paises.add(new Pais("Qatar","a",0,0,0,0,true));
		paises.add(new Pais("Ecuador","a",0,0,0,0,true));
		paises.add(new Pais("Senegal","a",0,0,0,0,true));
		paises.add(new Pais("Netherlands","a",0,0,0,0,true));
		paises.add(new Pais("England","b",0,0,0,0,true));
		paises.add(new Pais("Iran","b",0,0,0,0,true));
		paises.add(new Pais("USA","b",0,0,0,0,true));
		paises.add(new Pais("Wales","b",0,0,0,0,true));
		paises.add(new Pais("Argentina","c",0,0,0,0,true));
		paises.add(new Pais("Saudi Arabia","c",0,0,0,0,true));
		paises.add(new Pais("Mexico","c",0,0,0,0,true));
		paises.add(new Pais("Poland","c",0,0,0,0,true));
		paises.add(new Pais("France","d",0,0,0,0,true));
		paises.add(new Pais("Australia","d",0,0,0,0,true));
		paises.add(new Pais("Denmark","d",0,0,0,0,true));
		paises.add(new Pais("Tunisia","d",0,0,0,0,true));
		paises.add(new Pais("Spain","e",0,0,0,0,true));
		paises.add(new Pais("Costa Rica","e",0,0,0,0,true));
		paises.add(new Pais("Germany","e",0,0,0,0,true));
		paises.add(new Pais("Japan","e",0,0,0,0,true));
		paises.add(new Pais("Belgium","f",0,0,0,0,true));
		paises.add(new Pais("Canada","f",0,0,0,0,true));
		paises.add(new Pais("Morocco","f",0,0,0,0,true));
		paises.add(new Pais("Croatia","f",0,0,0,0,true));
		paises.add(new Pais("Brazil","g",0,0,0,0,true));
		paises.add(new Pais("Serbia","g",0,0,0,0,true));
		paises.add(new Pais("Switzerland","g",0,0,0,0,true));
		paises.add(new Pais("Cameroon","g",0,0,0,0,true));
		paises.add(new Pais("Portugal","h",0,0,0,0,true));
		paises.add(new Pais("Ghana","h",0,0,0,0,true));
		paises.add(new Pais("Uruguay","h",0,0,0,0,true));
		paises.add(new Pais("Korea Republic","h",0,0,0,0,true));
		
		Encargado.PreguntarNombre();
	
		ImprimirMenuPrincipal(paisesManual32,paisesManual16,paises,partidos,paises16,partidos16,paises8,partidos8,paises4,partidos4,paises2,partidos2,paises1,paises.get(0),paises.get(1),paises.get(2),paises.get(3));
			
	} 
	//Termina Main

	public static void ImprimirMenuPrincipal(LinkedList<Pais> paisesManual32,LinkedList<Pais> paisesManual16,LinkedList<Pais>pais,LinkedList<Partido>partido,LinkedList<Pais>pais16,LinkedList<Partido>partido16,LinkedList<Pais>pais8,LinkedList<Partido>partido8,LinkedList<Pais>pais4,LinkedList<Partido>partido4,LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1,Pais p1,Pais p2,Pais p3,Pais p4){
		/*
		Scanner entrada = new Scanner(System.in);

		System.out.println("--------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXXX Menu Principal XXXXXXXXXXXXXXXXX");
		System.out.println("X                                                X");
		System.out.println("X 1. Iniciar Mundial en Modo Automatico          X");
		System.out.println("X 2. Iniciar Mundial en Modo Manual              X");
		System.out.println("X                  X");
		System.out.println("X                            X");
		System.out.println("X                                                X");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("--------------------------------------------------");
		int opcion = entrada.nextInt();
		*/
		String[] smp = {"Automatico","Manual"};
		int opmp = JOptionPane.showOptionDialog(null, "Que configuracion gustaria usar?", "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, smp, smp[0]);

		switch (opmp) {

		case 0:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Partido.CargarPartidos32(pais,partido);
			ImprimirMenu32(pais, partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		case 1:
			System.out.println("Modo Manual");
			ImprimirMenuModoManual(paisesManual32,paisesManual16,pais, partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenuPrincipal(paisesManual32,paisesManual16,pais, partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		}
	}
	
	public static void ImprimirMenuFinal(LinkedList<Pais>pais1){
		/*
		Scanner entrada = new Scanner(System.in);

		System.out.println("--------------------------------------------------");
		System.out.println("                                                  ");
		System.out.println("         El Ganador del Mundial es "+ pais1.get(0).getNombre());
		System.out.println("                                                  ");
		System.out.println("--------------------------------------------------");
		System.out.println("X               RESUMEN DEL PAIS                 X");
		System.out.println("--------------------------------------------------");
		System.out.println("                                                  ");
		System.out.println("        Grupo: "+pais1.get(0).getGrupo()+" - "+"Partidos Jugados: "+pais1.get(0).getCantidadpartidos());
		System.out.println("        Goles Totales: "+pais1.get(0).getGoles()+" - "+"Goles en Contra: "+pais1.get(0).getGoles_contra());
		System.out.println("                                                  ");
		System.out.println("     Presione 1 para Finalizar el Programa        ");
		System.out.println("--------------------------------------------------");

		int opcion = entrada.nextInt();
		*/
		
		JOptionPane.showMessageDialog(null, "El Ganador del Mundial es "+ pais1.get(0).getNombre());
		
		JOptionPane.showMessageDialog(null, "Grupo: "+pais1.get(0).getGrupo()+" - "+"Partidos Jugados: "+pais1.get(0).getCantidadpartidos()+"\nGoles Totales: "+pais1.get(0).getGoles()+" - "+"Goles en Contra: "+pais1.get(0).getGoles_contra());
/*
		switch (opf) {

		case 1:
			System.out.println("Gracias por usar el Programa <3");
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			break;
		default:
			System.out.println("                   ");
			System.out.println("Solo Ingrese 1 para finalizar el Sistema");
			System.out.println("                   ");
			System.out.println("                   ");
			ImprimirMenuFinal(pais1);
			break;
		}
*/
		
	}
	
	public static void ImprimirMenu32(LinkedList<Pais>pais, LinkedList<Partido>partido,LinkedList<Pais>pais16,LinkedList<Partido>partido16,LinkedList<Pais>pais8,LinkedList<Partido>partido8,LinkedList<Pais>pais4,LinkedList<Partido>partido4,LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1,Pais p1,Pais p2,Pais p3,Pais p4) {
		/*
		Scanner entrada = new Scanner(System.in);

		System.out.println("--------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXXX Fase de Grupos XXXXXXXXXXXXXXXXX");
		System.out.println("X                                                X");
		System.out.println("X 1. Mostrar Equipos                             X");
		System.out.println("X 2. Mostrar Resultado Partidos                  X");
		System.out.println("X 3. Avanzar a la Siguiente Fase                 X");
		System.out.println("X 4. Salir del Sistema                           X");
		System.out.println("X                                                X");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("--------------------------------------------------");
		int opcion = entrada.nextInt();
		*/
		
		String[] sm32 = {"Mostrar Equipos","Resultados","Avanzar de Fase"};
		int opm32 = JOptionPane.showOptionDialog(null, "32 Equipos Restantes", "Automatico - Fase de grupos", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sm32, sm32[0]);

		
		switch (opm32) {

		case 0:
			Pais.MostrarListaEquipos(pais);
			ImprimirMenu32(pais,partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		case 1:
			Partido.MostrarListaPartidos(partido);
			ImprimirMenu32(pais,partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		case 2:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Encargado.AvanzarGanador32(pais,pais16);
			Partido.CargarPartidos16(pais16,partido16);
			ImprimirMenu16(pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenu32(pais,partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		}
	}
	
	public static void ImprimirMenu16(LinkedList<Pais> pais16,LinkedList<Partido>partidos16,LinkedList<Pais>pais8,LinkedList<Partido>partido8,LinkedList<Pais>pais4,LinkedList<Partido>partido4,LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1) {
		/*
		Scanner entrada = new Scanner(System.in);

		System.out.println("--------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXX Octavos de Final XXXXXXXXXXXXXXXX");
		System.out.println("X                                                X");
		System.out.println("X 1. Mostrar Equipos                             X");
		System.out.println("X 2. Mostrar Resultado Partidos                  X");
		System.out.println("X 3. Avanzar a la Siguiente Fase                 X");
		System.out.println("X 4. Salir del Sistema                           X");
		System.out.println("X                                                X");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("--------------------------------------------------");
		int opcion = entrada.nextInt();
		*/
		
		String[] sm16 = {"Mostrar Equipos","Resultados","Avanzar de Fase"};
		int opm16 = JOptionPane.showOptionDialog(null, "16 Equipos Restantes", "Automatico - Octavos de Final", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sm16, sm16[0]);

		
		switch (opm16) {

		case 0:
			Pais.MostrarListaEquipos(pais16);
			ImprimirMenu16(pais16,partidos16,pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		case 1:
			Partido.MostrarListaPartidos(partidos16);
			ImprimirMenu16(pais16, partidos16,pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		case 2:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Encargado.AvanzarGanador16(pais16,partidos16,pais8);
			Partido.CargarPartidos8(pais8, partido8);
			ImprimirMenu8(pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenu16(pais16, partidos16,pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;

		
		}
	}	
	
	public static void ImprimirMenu8(LinkedList<Pais>pais8,LinkedList<Partido>partido8,LinkedList<Pais>pais4,LinkedList<Partido>partido4,LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1) { 
		/*
		Scanner entrada = new Scanner(System.in);

		System.out.println("--------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXX Cuartos de Final XXXXXXXXXXXXXXXX");
		System.out.println("X                                                X");
		System.out.println("X 1. Mostrar Equipos                             X");
		System.out.println("X 2. Mostrar Resultado Partidos                  X");
		System.out.println("X 3. Avanzar a la Siguiente Fase                 X");
		System.out.println("X 4. Salir del Sistema                           X");
		System.out.println("X                                                X");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("--------------------------------------------------");
		int opcion = entrada.nextInt();
		*/
		
		String[] sm8 = {"Mostrar Equipos","Resultados","Avanzar de Fase"};
		int opm8 = JOptionPane.showOptionDialog(null, "8 Equipos Restantes", "Automatico - Cuartos de Final", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sm8, sm8[0]);

		switch (opm8) {

		case 0:
			Pais.MostrarListaEquipos(pais8);
			ImprimirMenu8(pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		case 1:
			Partido.MostrarListaPartidos(partido8);
			ImprimirMenu8(pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		case 2:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Encargado.AvanzarGanador8(pais8,partido8,pais4);
			Partido.CargarPartidos4(pais4,partido4);
			ImprimirMenu4(pais4,partido4,pais2,partido2,pais1);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenu8(pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;

		
	}
		
}

	public static void ImprimirMenu4(LinkedList<Pais>pais4,LinkedList<Partido>partido4,LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1) {
		/*
		Scanner entrada = new Scanner(System.in);

		System.out.println("--------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXXXXX Semi Final XXXXXXXXXXXXXXXXXXX");
		System.out.println("X                                                X");
		System.out.println("X 1. Mostrar Equipos                             X");
		System.out.println("X 2. Mostrar Resultado Partidos                  X");
		System.out.println("X 3. Avanzar a la Siguiente Fase                 X");
		System.out.println("X 4. Salir del Sistema                           X");
		System.out.println("X                                                X");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("--------------------------------------------------");
		int opcion = entrada.nextInt();
		*/
		
		String[] sm8 = {"Mostrar Equipos","Resultados","Avanzar de Fase"};
		int opm8 = JOptionPane.showOptionDialog(null, "4 Equipos Restantes", "Automatico - Semi Final", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sm8, sm8[0]);

		switch (opm8) {

		case 0:
			Pais.MostrarListaEquipos(pais4);
			ImprimirMenu4(pais4,partido4,pais2,partido2,pais1);
			break;
		case 1:
			Partido.MostrarListaPartidos(partido4);
			ImprimirMenu4(pais4,partido4,pais2,partido2,pais1);
			break;
		case 2:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Encargado.AvanzarGanador4(pais4,partido4,pais2);
			Partido.CargarPartidos2(pais2,partido2);
			ImprimirMenu2(pais2,partido2,pais1);
			break;
			default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenu4(pais4,partido4,pais2,partido2,pais1);
			break;

		}	
	}
	
	public static void ImprimirMenu2(LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1) {
		/*
		Scanner entrada = new Scanner(System.in);

		System.out.println("-------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXXXXXXX Final XXXXXXXXXXXXXXXXXXXXX");
		System.out.println("X                                               X");
		System.out.println("X 1. Mostrar Equipos                            X");
		System.out.println("X 2. Mostrar Resultado Partidos                 X");
		System.out.println("X 3. Ver Campeon                                X");
		System.out.println("X 4. Salir del Sistema                          X");
		System.out.println("X                                               X");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("--------------------------------------------------");

		int opcion = entrada.nextInt();
		*/
		
		String[] sm4 = {"Mostrar Equipos","Resultados","Avanzar de Fase"};
		int opm4 = JOptionPane.showOptionDialog(null, "2 Equipos Restantes", "Automatico - Final", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sm4, sm4[0]);

		switch (opm4) {

		case 0:
			Pais.MostrarListaEquipos(pais2);
			ImprimirMenu2(pais2,partido2,pais1);
			break;
		case 1:
			Partido.MostrarListaPartidos(partido2);
			ImprimirMenu2(pais2,partido2,pais1);
			break;
		case 2:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Encargado.AvanzarGanador2(pais2,partido2,pais1);
			ImprimirMenuFinal(pais1);
			break;
			default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			//ImprimirMenu1(pais2,partido2);
			break;

		}	

		
	}
	
	public static void ImprimirMenuModoManual (LinkedList<Pais> paisesManual32,LinkedList<Pais> paisesManual16,LinkedList<Pais>paisesManual8,LinkedList<Pais>paisesManual4,LinkedList<Pais>paisesManual2,LinkedList<Partido>partido,LinkedList<Partido>partido16,LinkedList<Partido>partido8,LinkedList<Partido>partido4,LinkedList<Partido>partido2,Pais p1,Pais p2,Pais p3,Pais p4) {
		/*
		Scanner entrada = new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXX Menu Modo Manual XXXXXXXXXXXXXXXX");
		System.out.println("X                                                X");
		System.out.println("X 1. Inicializar Modo Manual                     X");
		System.out.println("X 2. Mostrar Lista de Equipos                    X");
		System.out.println("X 3. Volver Atras                                X");
		System.out.println("X 4. Salir del Sistema                           X");
		System.out.println("X                                                X");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("--------------------------------------------------");
		int opcion = entrada.nextInt();
		*/
		
		String[] smmm = {"Iniciar Modo Manual","Volver Atras"};
		int opmmm = JOptionPane.showOptionDialog(null, "Eliga una opcion", "Modo Manual - Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, smmm, smmm[0]);
		System.out.println("Opcion = "+opmmm);
		int cfg;
		
		switch (opmmm) {

		case 0:
			System.out.println("                   ");
			String[] op1 = {"32", "16", "8","4","2"};
			cfg = JOptionPane.showOptionDialog(null, "Cuantos equipos van a jugar?", "Configuracion", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, op1, op1[0]);
			System.out.println("CFG == "+cfg);
			System.out.println("Cargando Equipos...");
			Encargado.CargarEquiposManual(paisesManual32,cfg);	
			ImprimirMenuManual32(paisesManual32,paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2);
			break;
		case 1:
			System.out.println("Volviendo al Menu Principal...");
			ImprimirMenuPrincipal(paisesManual32,paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2,p1,p2,p3,p4);
			break;
			default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenuModoManual(paisesManual32,paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2,p1,p2,p3,p4);
			break;
		}
	}


	
	public static void ImprimirMenuManual32(LinkedList<Pais> paisesManual32,LinkedList<Pais> paisesManual16,LinkedList<Pais> paisesManual8,LinkedList<Pais> paisesManual4,LinkedList<Pais> paisesManual2,LinkedList<Partido>partido,LinkedList<Partido>partido16,LinkedList<Partido>partido8,LinkedList<Partido>partido4,LinkedList<Partido>partido2) {
		
		String[] sopm32 = {"Ingresar Resultados","Mostrar Equipos","Mostrar Partidos", "Avanzar de Fase"};
		int opm32 = JOptionPane.showOptionDialog(null, "32 Equipos Restantes", "Manual - Fase de Grupos", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sopm32, sopm32[0]);

		switch (opm32) {
		case 0:
			if (partido.isEmpty()) {
				Partido.CargarPartidosManual32(paisesManual32,partido);
			} else {	
				JOptionPane.showMessageDialog(null, "La lista de partida esta llena");
			}
			ImprimirMenuManual32(paisesManual32,paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2);
			break;
		case 1:
			Pais.MostrarListaEquipos(paisesManual32);
			ImprimirMenuManual32(paisesManual32,paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2);
		break;
		case 2:
				Partido.MostrarListaPartidos(partido);
				ImprimirMenuManual32(paisesManual32,paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2);
			break;
		case 3:
				Encargado.AvanzarGanador32(paisesManual32,paisesManual16);
				ImprimirMenuManual16(paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2);
			break;
		default:
				JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
				ImprimirMenuManual32(paisesManual32,paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2);
			break;
		}
	}
	
	public static void ImprimirMenuManual16(LinkedList<Pais> paisesManual16, LinkedList<Pais> paisesManual8,LinkedList<Pais> paisesManual4,LinkedList<Pais> paisesManual2, LinkedList<Partido>partido,LinkedList<Partido>partido16,LinkedList<Partido>partido8,LinkedList<Partido>partido4,LinkedList<Partido>partido2) {
		
		String[] sopm16 = {"Ingresar Resultados","Mostrar Equipos","Mostrar Partidos", "Avanzar de Fase"};
		int opm16 = JOptionPane.showOptionDialog(null, "16 Equipos Restantes", "Manual - Octavos de Final", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sopm16, sopm16[0]);

		switch (opm16) {
		case 0:
			if (partido16.isEmpty()) {
				Partido.CargarPartidos16(paisesManual16,partido16);
			} else {	
				
				JOptionPane.showMessageDialog(null, "La lista de partidos esta llena");
				ImprimirMenuManual16(paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2);
			}
			break;
		case 1:
				Pais.MostrarListaEquipos(paisesManual16);
				ImprimirMenuManual16(paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2);
			break;
		case 2:
			
			if (paisesManual16.isEmpty()) {
				JOptionPane.showMessageDialog(null, "La lista de partidos esta vacia");
				ImprimirMenuManual16(paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2);
			} else {
				Partido.MostrarListaPartidos(partido16);
				ImprimirMenuManual16(paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2);
			}
			break;
		case 3:
			Encargado.AvanzarGanador16(paisesManual16,partido16,paisesManual8);
			ImprimirMenuManual8(paisesManual8,paisesManual4,paisesManual2,partido8,partido4,partido2);
		break;
		default:
				JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
				ImprimirMenuManual16(paisesManual16,paisesManual8,paisesManual4,paisesManual2,partido,partido16,partido8,partido4,partido2);
			break;
		}
		
		
	}
	
	public static void ImprimirMenuManual8(LinkedList<Pais> paisesManual8,LinkedList<Pais> paisesManual4,LinkedList<Pais> paisesManual2,LinkedList<Partido>partido8,LinkedList<Partido>partido4,LinkedList<Partido>partido2) {
		
		String[] sopm8 = {"Ingresar Resultados","Mostrar Equipos","Mostrar Partidos", "Avanzar de Fase"};
		int opm8 = JOptionPane.showOptionDialog(null, "8 Equipos Restantes", "Manual - Cuartos de Final", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sopm8, sopm8[0]);

		switch (opm8) {
		case 0:
			if (partido8.isEmpty()) {
				Partido.CargarPartidos8(paisesManual8,partido8);
				ImprimirMenuManual8(paisesManual8,paisesManual4,paisesManual2,partido8,partido4,partido2);
			} else {	
				JOptionPane.showMessageDialog(null, "La lista de partidos esta llena");
				
			}
			ImprimirMenuManual8(paisesManual8,paisesManual4,paisesManual2,partido8,partido4,partido2);
			break;
		case 1:
				Pais.MostrarListaEquipos(paisesManual);
				ImprimirMenuManual8(paisesManual8,paisesManual4,paisesManual2,partido8,partido4,partido2);
			break;
		case 2:
			
			if (paisesManual.isEmpty()) {
				JOptionPane.showMessageDialog(null, "La lista de partidos esta vacia");
				ImprimirMenuManual8(paisesManual8,paisesManual4,paisesManual2,partido8,partido4,partido2);
			} else {
				ImprimirMenuManual4(paisesManual,partido);
			}
			break;
		case 3:
			
			break;
		default:
				JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
				ImprimirMenuManual8(paisesManual8,paisesManual4,paisesManual2,partido8,partido4,partido2);
			break;
		}
	}
	
	public static void ImprimirMenuManual4(LinkedList<Pais> paisesManual,LinkedList<Partido>partido) {
			
		String[] sopm4 = {"Ingresar Resultados", "Mostrar Partidos", "Avanzar de Fase"};
		int opm4 = JOptionPane.showOptionDialog(null, "4 Equipos Restantes", "Manual - Fase de Grupos", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sopm4, sopm4[0]);

		switch (opm4) {
		case 0:
			if (paisesManual.isEmpty()) {
				Partido.CargarPartidosManual32(paisesManual,partido);
			} else {	
				JOptionPane.showMessageDialog(null, "La lista de partidos esta llena");
			}
			ImprimirMenuManual4(paisesManual,partido);
			break;
		case 1:
				Pais.MostrarListaEquipos(paisesManual);
				ImprimirMenuManual4(paisesManual,partido);
			break;
		case 2:
			
			if (paisesManual.isEmpty()) {
				JOptionPane.showMessageDialog(null, "La lista de partidos esta vacia");
				ImprimirMenuManual4(paisesManual,partido);
			} else {
				ImprimirMenuManual2(paisesManual,partido);
			}
			break;
		default:
				JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
				ImprimirMenuManual4(paisesManual,partido);
			break;
		}
	}	
	
	public static void ImprimirMenuManual2(LinkedList<Pais> paisesManual,LinkedList<Partido>partido) {
				
		String[] sopm2 = {"Ingresar Resultados", "Mostrar Partidos", "Avanzar de Fase"};
		int opm2 = JOptionPane.showOptionDialog(null, "4 Equipos Restantes", "Manual - Fase de Grupos", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, sopm2, sopm2[0]);

		switch (opm2) {
		case 0:
			if (paisesManual.isEmpty()) {
				//Partido.CargarPartidosManual2(paisesManual,partido);
			} else {	
				JOptionPane.showMessageDialog(null, "La lista de partidos esta llena");
			}
			ImprimirMenuManual2(paisesManual,partido);
			break;
		case 1:
				Pais.MostrarListaEquipos(paisesManual);
				ImprimirMenuManual2(paisesManual,partido);
			break;
		case 2:
			
			if (paisesManual.isEmpty()) {
				JOptionPane.showMessageDialog(null, "La lista de partidos esta vacia");
				ImprimirMenuManual2(paisesManual,partido);
			} else {
				//ImprimirMenuFinal(paisesManual,partido);
			}
			break;
		default:
				JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
				ImprimirMenuManual2(paisesManual,partido);
			break;
		}
				
				
			}

			
		

		
	}



