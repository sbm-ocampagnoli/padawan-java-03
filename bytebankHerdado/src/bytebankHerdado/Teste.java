package bytebankHerdado;

public class Teste {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setSalario(3000.0);
		System.out.println(f1.getTipo());
		System.out.println(f1.getBonificacao());
	}
}
