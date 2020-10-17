package aulas_jcavi;

/**
 * @author Marcelo da Silva
 * Esta classe utiliza de alguns atributos que naturalmente dcevem ser criados como um Objeto,
 * exemplo marca, deveriamos criar uma Classe Marca e após isto sim fazer a criação de um objeto do tipo Marca para compor o veículo
 * para fins didáticos esta sendo definido desta forma, em versões futuras será alterado para o correto.
 * 
 */

public class Veiculo {

	private String nome;
	private String marca;
	private Double preco;
	private boolean frear;
	
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Veiculo [nome=" + nome + ", marca=" + marca + ", preco=" + preco + ", frear=" + frear + "]";
	}
	
	
	
	public String acelerar(String vl) {
		return "Acelerar "+vl;
	}
	
	public String desacelerar(String vl) {
		return "Desacelerar "+vl;
	}
	
	
	public String frear() {
		return "Parando o Veículo";
	}

	public boolean isFrear() {
		return frear;
	}

	public void setFrear(boolean frear) {
		this.frear = frear;
	}
	
	public String trocarMarcha(int marcha) {
		
		return "Trocando para a Marcha: "+marcha;
	
	}
	
	
}
