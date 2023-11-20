package ReinoAnimal;

/*
 * @autor José Lucas Menezes Lopes
 */

import java.util.Date;

public class Terrestre extends Animal{
	
	String regiao; // Regiao onde o animal habita
	boolean pelo; //Veirifa se o animal possui pelo

	public Terrestre(String especie, String sexo, int dataNascimento, String regiao,
			boolean pelo) {
		super(especie, sexo, dataNascimento, getContador());
		this.regiao = regiao;
		this.pelo = pelo;
	}// Construtor

	public String getRegiao() {
		return regiao;
	}// Informa a regiao que o animal vive

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}// Seleciona a regiao que o animal vive

	
	public boolean isPelo() {
		return pelo;
	} // Informa se o animal possui pelo

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	} // Seleciona se o animal possui pelo

	public String comer() {
		return "o animal terrestre esta comendo";
	}// Informa se o animal esta comendo
	
	public String perfil() {
		return "Especie: " + getEspecie() + "\n"
				+ "Sexo: " + getSexo()+ "\n" 
				+ "Data de nascimento: " + getDataNascimento() + "\n"
				+ "Região: " + getRegiao() + "\n"
				+ "Possui pelos: " + isPelo() + "\n";
	}// Informa as caracteristicas do animal,sua especie, seu sexo e etc
	
	
	
}
