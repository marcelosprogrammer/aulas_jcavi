package aulas_jcavi;

public class UsaVeiculo {

	public static void main(String[] args) {
		
		
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setNome("Fusca");
		veiculo.setMarca("volks");
		veiculo.setPreco(70.000);
		veiculo.setFrear(false);
		
		
		System.out.println(veiculo.trocarMarcha(3));		
		System.out.println(veiculo.acelerar("50"));		
		
		System.out.println(veiculo.getNome() + " "+ veiculo.getMarca());
		System.out.println(veiculo.getMarca());
		System.out.println(veiculo.getPreco());
		
		System.out.println(veiculo);
		
		
		VeiculoMaritimo veiculoM = new VeiculoMaritimo();
		veiculoM.setNome("Submarino");
		veiculoM.setMarca("XPTO");
		veiculoM.setPreco(100.000);
		veiculoM.setTipoDeVela("VELA 1");
		veiculoM.setFrear(true);
		
		System.out.println(veiculoM.acelerar("80"));
		System.out.println(veiculoM.trocarMarcha(4));
		
		System.out.println(veiculoM);

		
		
		
	}

}
