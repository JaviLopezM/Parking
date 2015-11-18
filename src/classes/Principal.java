package classes;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
	static ArrayList<Vehicle> arrayParking= new ArrayList<Vehicle>();
	Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner control = new Scanner(System.in);
		Principal M= new Principal();
		Xml XML =new Xml();
		
		System.out.println("Carreguem les dades de l'arxiu txt:\n");
		InOut.llegir("./vehicles.dat");	
		System.out.println("Benvingut al gestor del Pàrking.\n");
		
		System.out.println("Vols introduïr un nou vehicle? (S/N).\n");

		String a= control.nextLine();
		if (a.equalsIgnoreCase("s")){
			M.entradaArrai();
		}

		System.out.println("Vols veure els vehicles introduïts? (S/N).\n");
		String b= control.nextLine();
		if (b.equalsIgnoreCase("s")){
		M.impresio();
		}
		
		System.out.println("Guardem les dades en un arxiu txt....\n");
		InOut.escriure("./vehicles.dat");
		
		System.out.println("Vols generar un fitxer XML? (S/N).\n");
		String c= control.nextLine();
		if (c.equalsIgnoreCase("s")){
		XML.xml();
		}

		
		
	}
	
	public void entradaArrai() {
		for (boolean i = true;i;){
		String nom=input("nom: ");
		String cognom=input("cognom: ");
		String tipus=input("tipus de vehicle: ");
		String matricula=input("matricula: ");
		String marca=input("marca: ");
		String model=input("model: ");
		String color=input("color: ");
		//String plasa=input("plaça: ");

		String plasa = String.format("%02d",arrayParking.size()+1);

		arrayParking.add(new Vehicle(nom, cognom, tipus, matricula, marca, model, color, plasa));
		System.out.print("Introduir un altre vehicle? (s/n)");
		String a= reader.nextLine();
		if (a.equalsIgnoreCase("s"));
		else{
			i=false;
		}
		}
		}
	
	private String input(String valor) {
		System.out.print(valor);
		String a= reader.nextLine();
		return a;
	}
	private void impresio(){
		for (int i = 0; i < arrayParking.size(); i++) {
			System.out.print(arrayParking.get(i).getNom());
			System.out.println(" "+arrayParking.get(i).getCognom());
			System.out.println(arrayParking.get(i).getTipus());
			System.out.println(arrayParking.get(i).getMatricula());
			System.out.println(arrayParking.get(i).getModel());
			System.out.println(arrayParking.get(i).getColor());
			System.out.println(arrayParking.get(i).getPlasa()+"\n");
						
		}
	}
}
