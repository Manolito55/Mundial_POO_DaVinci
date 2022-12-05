package Interfaz;

import java.util.LinkedList;
import java.util.Scanner;
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
	
		ImprimirMenuPrincipal(paises,partidos,paises16,partidos16,paises8,partidos8,paises4,partidos4,paises2,partidos2,paises1,paises.get(0),paises.get(1),paises.get(2),paises.get(3));
			
	} 
	//Termina Main
	
	public static void ImprimirMenuPrincipal(LinkedList<Pais>pais,LinkedList<Partido>partido,LinkedList<Pais>pais16,LinkedList<Partido>partido16,LinkedList<Pais>pais8,LinkedList<Partido>partido8,LinkedList<Pais>pais4,LinkedList<Partido>partido4,LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1,Pais p1,Pais p2,Pais p3,Pais p4){
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("--------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXXX Menu Principal XXXXXXXXXXXXXXXXX");
		System.out.println("X                                                X");
		System.out.println("X 1. Iniciar Mundial en Modo Automatico          X");
		System.out.println("X 2. Iniciar Mundial en Modo Manual (WIP)        X");
		System.out.println("X 3. Cambiar Configuracion (WIP)                 X");
		System.out.println("X 4. Salir del Sistema                           X");
		System.out.println("X                                                X");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("--------------------------------------------------");

		int opcion = entrada.nextInt();
		switch (opcion) {

		case 1:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Partido.CargarPartidos32(pais,partido);
			ImprimirMenu32(pais, partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		case 2:
			System.out.println("Proximamente...");
			ImprimirMenuPrincipal(pais, partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		case 3:
			System.out.println("Proximamente...");
			ImprimirMenuPrincipal(pais, partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		case 4:
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenuPrincipal(pais, partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		}
	}
	
	public static void ImprimirMenuFinal(LinkedList<Pais>pais1){
		
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
		switch (opcion) {

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

		
	}
	
	public static void ImprimirMenu32(LinkedList<Pais>pais, LinkedList<Partido>partido,LinkedList<Pais>pais16,LinkedList<Partido>partido16,LinkedList<Pais>pais8,LinkedList<Partido>partido8,LinkedList<Pais>pais4,LinkedList<Partido>partido4,LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1,Pais p1,Pais p2,Pais p3,Pais p4) {
		
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
		switch (opcion) {

		case 1:
			Pais.MostrarListaEquipos(pais);
			ImprimirMenu32(pais,partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		case 2:
			Partido.MostrarListaPartidos(partido);
			ImprimirMenu32(pais,partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		case 3:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Encargado.AvanzarGanador32(pais,pais16);
			Partido.CargarPartidos16(pais16,partido16);
			ImprimirMenu16(pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		case 4:
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			break;

		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenu32(pais,partido,pais16,partido16,pais8,partido8,pais4,partido4,pais2,partido2,pais1,p1,p2,p3,p4);
			break;
		}
	}
	
	public static void ImprimirMenu16(LinkedList<Pais> pais16,LinkedList<Partido>partidos16,LinkedList<Pais>pais8,LinkedList<Partido>partido8,LinkedList<Pais>pais4,LinkedList<Partido>partido4,LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1) {
		
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
		switch (opcion) {

		case 1:
			Pais.MostrarListaEquipos(pais16);
			ImprimirMenu16(pais16,partidos16,pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		case 2:
			Partido.MostrarListaPartidos(partidos16);
			ImprimirMenu16(pais16, partidos16,pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		case 3:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Encargado.AvanzarGanador16(pais16,partidos16,pais8);
			Partido.CargarPartidos8(pais8, partido8);
			ImprimirMenu8(pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		case 4:
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenu16(pais16, partidos16,pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;

		
		}
	}	
	
	public static void ImprimirMenu8(LinkedList<Pais>pais8,LinkedList<Partido>partido8,LinkedList<Pais>pais4,LinkedList<Partido>partido4,LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1) { 
		
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
		switch (opcion) {

		case 1:
			Pais.MostrarListaEquipos(pais8);
			ImprimirMenu8(pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		case 2:
			Partido.MostrarListaPartidos(partido8);
			ImprimirMenu8(pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;
		case 3:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Encargado.AvanzarGanador8(pais8,partido8,pais4);
			Partido.CargarPartidos4(pais4,partido4);
			ImprimirMenu4(pais4,partido4,pais2,partido2,pais1);
			break;
		case 4:
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenu8(pais8,partido8,pais4,partido4,pais2,partido2,pais1);
			break;

		
	}
		
}

	public static void ImprimirMenu4(LinkedList<Pais>pais4,LinkedList<Partido>partido4,LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1) {
		
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
		switch (opcion) {

		case 1:
			Pais.MostrarListaEquipos(pais4);
			ImprimirMenu4(pais4,partido4,pais2,partido2,pais1);
			break;
		case 2:
			Partido.MostrarListaPartidos(partido4);
			ImprimirMenu4(pais4,partido4,pais2,partido2,pais1);
			break;
		case 3:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Encargado.AvanzarGanador4(pais4,partido4,pais2);
			Partido.CargarPartidos2(pais2,partido2);
			ImprimirMenu2(pais2,partido2,pais1);
			break;
		case 4:
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenu4(pais4,partido4,pais2,partido2,pais1);
			break;

		}	
	}
	
	public static void ImprimirMenu2(LinkedList<Pais>pais2,LinkedList<Partido>partido2,LinkedList<Pais>pais1) {
		
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
		switch (opcion) {

		case 1:
			Pais.MostrarListaEquipos(pais2);
			ImprimirMenu2(pais2,partido2,pais1);
			break;
		case 2:
			Partido.MostrarListaPartidos(partido2);
			ImprimirMenu2(pais2,partido2,pais1);
			break;
		case 3:
			System.out.println("Jugando Partidos...");
			System.out.println("                   ");
			Encargado.AvanzarGanador2(pais2,partido2,pais1);
			ImprimirMenuFinal(pais1);
			break;
		case 4:
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			//ImprimirMenu1(pais2,partido2);
			break;

		}	

		
	}
	
}
