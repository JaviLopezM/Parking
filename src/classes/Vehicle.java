package classes;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Vehicle implements Serializable{
	private String nom;
	private String cognom;
	private String tipus;
	public String matricula;
	private String marca;
	private String model;
	private String color;
	private int plasa;
        private float preu;
        private String horaEntrada;
	
	
	public Vehicle (String nom, String cognom,  String tipus, String matricula, String marca,
                String model, String color, int plasa, float preu, String horaEntrada){
		this.nom = nom;
		this.cognom = cognom;
		this.tipus = tipus;
		this.matricula = matricula;
		this.marca = marca;
		this.model = model;
		this.color = color;
		this.plasa = plasa;
                this.preu = preu;
                this.horaEntrada = horaEntrada;

		
		
	}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlasa() {
        return plasa;
    }

    public void setPlasa(int plasa) {
        this.plasa = plasa;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

   
    

    


	

}
