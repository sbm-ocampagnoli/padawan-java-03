package bytebankHerdado;

public class TesteFuncionario {
	public static void main(String[] args) {
		
		Funcionario otavio = new Funcionario ();
		otavio.setNome("Otávio Campagnoli");
		otavio.setCpf("321321314-43");
		otavio.setSalario(1000);
		
		System.out.println(otavio.getNome());
		System.out.println(otavio.getBonificacao());
	}
}
