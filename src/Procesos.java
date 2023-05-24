import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	HashMap<String, ArrayList<String>> Paises = new HashMap<>();
ArrayList<String>
	
	Ciudades = new ArrayList<String>();
	public void inicio() {
		int opcion = 0;
		System.out.println("Inicio");
		String menu ="CONSULTAR CIUDADES Y PAISES\n";
				menu+="1.Registrar pais.\n";
				menu+="2.Registrar ciudad.\n";
				menu+="3.Consultar por pais las ciudades asociadas.\n";
				menu+="4.Consultar ciudad.\n";
				menu+="5.Salir.\n";
		do {
			opcion= Integer.parseInt(JOptionPane.showInputDialog(menu));
			validacionmenu(opcion);
		} while (opcion!=5);
	}
	
	public void validacionmenu(int opcion) {
		switch (opcion) {
		
		case 1: ingresarPaises();
		break;
		
		case 2: if (Paises.keySet()!=null) {
			ingresarCiudades();
			}else {
				System.out.println("Debe primero llenar datos");
			}
		break;
		
		case 3:if (Paises.keySet()!=null) {
			consultarPaises();
			}else {
				System.out.println("Debe primero llenar datos");
			}
		
		break;
		
		case 4:if (Paises.keySet()!=null) {
			consultarCiudades();
			
		}else {
			System.out.println("Debe primero llenar datos");
		}
		break;
		
		case 5: System.out.println("taluego");
		break;
		
		}
		}
	

	public void ingresarPaises() {
		String salida;
		
		String Pais;
		
		
		do {
			Pais = JOptionPane.showInputDialog("ingrese el pais");
			
			ArrayList<String>
			
			Ciudades = new ArrayList<String>();
			
			
			
			Paises.put(Pais, Ciudades);
			System.out.println(Pais+" ha sido agregado");
			salida = JOptionPane.showInputDialog("desea continuar?");
		} while (salida.equalsIgnoreCase("SI"));
		
		
		
	}
	
	public void ingresarCiudades() {
		String salida;
		
		String Pais;
		
		String ciudad;
		
		do {
			Pais = JOptionPane.showInputDialog("ingrese el pais");
			ciudad = JOptionPane.showInputDialog("ingrese una ciudad a ese pais");
			
			ArrayList<String>
			
			Ciudades = Paises.getOrDefault(Pais, new ArrayList<>());
			
			Ciudades.add(ciudad);
			
			
			Paises.put(Pais, Ciudades);
			System.out.println(ciudad+" ha sido agregada a "+Pais);
			salida = JOptionPane.showInputDialog("desea continuar?");
		} while (salida.equalsIgnoreCase("SI"));
	}
	
public void consultarPaises() {
	String pais = JOptionPane.showInputDialog("Ingrese el pais que quiere consultar");
	
	ArrayList<String> Ciudades  = Paises.get(pais);
	
	if (Ciudades!=null) {
		System.out.println("ciudades el pais "+pais);
		for (String pais1 : Ciudades) {
			System.out.println(pais1);
		}
		
	}else {
		System.out.println("el pais no fue encontrado");
	}
	
	
}

public void consultarCiudades() {
	String ciudadBuscada = JOptionPane.showInputDialog("Ingrese la ciudad a buscar");
	
	String paisCiudad = null;
	
	for (String Pais : Paises.keySet()) {
		ArrayList<String> Ciudades  = Paises.get(Pais);
		
		if (Ciudades.contains(ciudadBuscada)) {
			paisCiudad = Pais;
			break;
		}
	}
	
	if (paisCiudad!=null) {
		System.out.println("La ciudad "+ciudadBuscada+" se encuentra en "+paisCiudad);
	}else {
		System.out.println("La ciudad "+ciudadBuscada+" no fue encontrada");
	}
}
	
}
