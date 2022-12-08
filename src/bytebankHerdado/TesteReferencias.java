package bytebankHerdado;

public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Pombo");
		String nome = g1.getNome();
		
		g1.setSalario(5000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		System.out.println(nome);
		System.out.println(controle.getSoma());
	}

}
