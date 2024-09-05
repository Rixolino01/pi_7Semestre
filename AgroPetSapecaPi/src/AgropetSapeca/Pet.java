package AgropetSapeca;

import java.sql.Date;

public class Pet {
	
	/*
	 * determinando os atributos da classe pet
	 */
	private String id_pet;
	private String nomePet;
	private String dataNascimentoPet;
	private String sexo;
	private String porte; // aqui é para indicar o tamanho do pet, podendo ser pequeno médio ou grande
	private String tipo;// cachorro, gato, cavalo...
	private String cpf;
	
	public String getId_pet() {
		return id_pet;
	}
	public void setId_pet(String id_pet) {
		this.id_pet = id_pet;
	}
	public String getNomePet() {
		return nomePet;
	}
	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}
	public String getDataNascimentoPet() {
		return dataNascimentoPet;
	}
	public void setDataNascimentoPet(String dataNascimentoPet) {
		this.dataNascimentoPet = dataNascimentoPet;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}