package ReinoAnimal;

/*
 * @autor Jos� Lucas Menezes Lopes
 */



public class Animal {

	private String especie; 
	private String sexo;
	private int dataNascimento;
	private static int contador; // Contador, informa a quantidade de animais por meio de incrementos
	
	
	

	public Animal(String especie, String sexo, int dataNascimento, int contador) {
		super();
		this.especie = especie;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.contador = contador;
		setContador(contador+1);
	} // Construtor

	
	


	public static int getContador() {
		return contador;
	} // Informa a quantidade de animais

	public String getEspecie() {
		return especie;
	} // Informa a especie do animal

	public void setEspecie(String especie) {
		this.especie = especie;
	} // Seleciona a especie do animal

	public String getSexo() {
		return sexo;
	} // Informa o sexo do animal

	public int getDataNascimento() {
		return dataNascimento;
	} // Informa a idade do animal

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}  // Seleciona a data de nascimento do animal

	public static void setContador(int contador) {
		Animal.contador = contador;
	}  // Incrementa um animal no contador

	public void setSexo(String sexo) {
		this.sexo = sexo;
	} // Seleciona o sexo do animal

	
	
	public String comer() {
		return "O animal está a se alimentar...";
	} // Informa que o animal está a se alimentar
	
	public String perfil(){
		return "Especie: " + this.especie + "\n"
				+ "Sexo: " + this.sexo + "\n" 
				+ "Data de nascimento: " + this.dataNascimento + "\n";
		
	} // Mostra o perfil do animal, sua especie, seu sexo e etc
	
	
}
