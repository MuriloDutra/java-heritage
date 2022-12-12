
public class TesteGerente {
	public static void main (String [] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Pedro Leite");
		gerente.setCpf("44444444444");
		gerente.setSalario(10000);
		gerente.setSenha(200);
		
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Salario: " + gerente.getSalario());
		System.out.println("Autenticou: " + gerente.autentica(200));
		System.out.println("Bonificacao: " + gerente.getBonificacao());
	}
}
