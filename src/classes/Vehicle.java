package classes;


public class Vehicle {
	String nom;
	String cognom;
	String tipus;
	String matricula;
	String marca;
	String model;
	String color;
	String plasa;
	
	
	public Vehicle (String nom, String cognom,  String tipus, String matricula, String marca, String model, String color, String plasa){
		this.nom = nom;
		this.cognom = cognom;
		this.tipus = tipus;
		this.matricula = matricula;
		this.marca = marca;
		this.model = model;
		this.color = color;
		this.plasa = plasa;
		
		
	}


	public String getNom() {
		return nom;
	}


	public String getCognom() {
		return cognom;
	}


	public String getTipus() {
		return tipus;
	}


	public String getMatricula() {
		return matricula;
	}


	public String getMarca() {
		return marca;
	}


	public String getModel() {
		return model;
	}


	public String getColor() {
		return color;
	}


	public String getPlasa() {
		return plasa;
	}

}
