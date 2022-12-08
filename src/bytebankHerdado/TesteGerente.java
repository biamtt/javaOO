package bytebankHerdado;

public class TesteGerente {
	public static void main(String[] args) {
		
		Gerente bianca = new Gerente();
		
		bianca.setNome("Bianca Mtt");
		bianca.setCpf("452.784.520-99");
		bianca.setSalario(5000);
		
		System.out.println(bianca.getNome());
		System.out.println(bianca.getCpf());
		System.out.println(bianca.getSalario());
		
		bianca.setSenha(22222);
		
		boolean autenticou = bianca.autentica(22222);
		System.out.println(autenticou);
		System.out.println(bianca.getBonificacao());
		
	}

}
