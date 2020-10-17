package aulas_jcavi;

public class UsaVeiculo {

	public static void main(String[] args) {
		
		
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setNome("Fusca");
		veiculo.setMarca("volks");
		veiculo.setPreco(70.000);
		
		System.out.println(veiculo.getNome() + " "+ veiculo.getMarca());
		System.out.println(veiculo.getMarca());
		System.out.println(veiculo.getPreco());
		
		System.out.println(veiculo);
		
		
		VeiculoMaritimo veiculoM = new VeiculoMaritimo();
		veiculoM.setNome("Submarino");
		veiculoM.setMarca("XPTO");
		veiculoM.setPreco(100.000);

		
		
		
	}

}
