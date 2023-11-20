package ReinoAnimal;

/*
 * @autor José Lucas Menezes Lopes
 */

import java.util.Date;

public class Aquatico extends Animal {
	
	private String tipoAgua; // Tipo da agua que o animal veve
	private boolean escamas; // Possui escamas ou nÃ£o (true / false)

	public Aquatico(String especie, String sexo, int dataNascimento, boolean escamas, String tipoAgua) {
		super(especie, sexo, dataNascimento, getContador());
		this.tipoAgua = tipoAgua;
		this.escamas = escamas;
	}

	public String getTipoAgua() {
		return tipoAgua;
	} // Informa o tipo da agua

	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}// Seleciona o tipo da agua

	public boolean isEscamas() {
		return escamas;
	}// Informa se possui escamas

	public void setEscamas(boolean escamas) {
		this.escamas = escamas;
	}// Seleciona se o animal possui escams

	public static String nadar() {
		return "O animal esta a nadar...";
	} // Informa se o animal esta nadando
	
	
	public String comer() {
		return "O animal aquatico esta a comer...";
	}// Informa se o animal esta comendo

	public String perfil() {
		return "Especie: " + getEspecie() + "\n"
				+ "Sexo: " + getSexo()+ "\n" 
				+ "Data de nascimento: " + getDataNascimento() + "\n"
				+ "Tipo de agua: " + getTipoAgua() + "\n"
				+ "Possui escamas: " + isEscamas() + "\n";
	}// Informa as caracteristicas do animal,sua especie, seu sexo e etc
}
