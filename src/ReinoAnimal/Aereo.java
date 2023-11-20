package ReinoAnimal;

/*
 * @autor José Lucas Menezes Lopes
 */

import java.util.Date;
public class Aereo extends Animal{

	double maxAltitude; // Informa a altitude maxima do voo
	
	public Aereo(String especie, String sexo, int dataNascimento, double maxAltitude) {
		super(especie, sexo, dataNascimento, getContador());
		this.maxAltitude = maxAltitude;
	}// Construtor


	
	public double getMaxAltitude() {
		return maxAltitude;
	} // Informa a altitude maxima do voo



	public void setMaxAltitude(double maxAltitude) {
		this.maxAltitude = maxAltitude;
	} // Seleciona a maxima altitude do voo



	public String comer() {
		return "o animal aereo esta comendo";
	}// Informa que o animal esta comendo

	public String perfil() {
		return "Especie: " + getEspecie() + "\n"
				+ "Sexo: " + getSexo()+ "\n" 
				+ "Data de nascimento: " + getDataNascimento() + "\n"
				+ "Altitude de voo: " + getMaxAltitude() + "\n";
	}// Informa as caracteristicas do animal,sua especie, seu sexo e etc
	
	
	
}
