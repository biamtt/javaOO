package bytebankHerdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario kevin = new Funcionario();
		
		kevin.setNome("Kevin Augusto");
		kevin.setCpf("145.874.698-77");
		kevin.setSalario(3900);
		
		System.out.println(kevin.getNome());
		System.out.println(kevin.getBonificacao());

	}

}
