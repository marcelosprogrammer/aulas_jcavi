package aulas_jcavi;

/**
 * @author Marcelo da Silva
 * Esta classe utiliza de alguns atributos que naturalmente dcevem ser criados como um Objeto,
 * exemplo marca, deveriamos criar uma Classe Marca e ap�s isto sim fazer a cria��o de um objeto do tipo Marca para compor o ve�culo
 * para fins did�ticos esta sendo definido desta forma, em vers�es futuras ser� alterado para o correto.
 * 
 */

public class Veiculo {

	private String nome;
	private String marca;
	
	public Veiculo() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}
