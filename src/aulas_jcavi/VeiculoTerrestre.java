package aulas_jcavi;

public class VeiculoTerrestre extends Veiculo {

	private String tipoDeRoda;

	public String getTipoDeRoda() {
		return tipoDeRoda;
	}

	public void setTipoDeRoda(String tipoDeRoda) {
		this.tipoDeRoda = tipoDeRoda;
	}

	@Override
	public String toString() {
		return "VeiculoTerrestre [tipoDeRoda=" + tipoDeRoda + ", getNome()=" + getNome() + ", getMarca()=" + getMarca()
				+ ", getPreco()=" + getPreco() + ", toString()=" + super.toString() + ", frear()=" + frear()
				+ ", isFrear()=" + isFrear() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
