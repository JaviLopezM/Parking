package classes;


public class cosa {
	public static void main(String[] args) {
		
	
	InOut.llegir("./bona.txt");
	
	String[] columnNames = {"Nom", "Cognom", "Tipus", "Matrícula", "Marca", "Model", "Color", "Plaça"};
	
	Object[][] dades = new Object[Principal.arrayParking.size()][8];

	for(int fila=0; fila<Principal.arrayParking.size(); fila++){
		for(int columna=0; columna<8; columna++){
			dades[fila][columna]=Principal.arrayParking.get(columna).getNom();
			columna++;
			dades[fila][columna]=Principal.arrayParking.get(columna).getCognom();
			columna++;
			dades[fila][columna]=Principal.arrayParking.get(columna).getTipus();
			columna++;
			dades[fila][columna]=Principal.arrayParking.get(columna).getMatricula();
			columna++;
			dades[fila][columna]=Principal.arrayParking.get(columna).getMarca();
			columna++;
			dades[fila][columna]=Principal.arrayParking.get(columna).getModel();
			columna++;
			dades[fila][columna]=Principal.arrayParking.get(columna).getColor();
			columna++;
			dades[fila][columna]=Principal.arrayParking.get(columna).getPlasa();
					
		}
	}
}
}


