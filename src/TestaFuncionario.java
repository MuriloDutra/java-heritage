
public class TestaFuncionario {
	public static void main(String [] args) {
		Funcionario funcionario = new Gerente();
		funcionario.setNome("Murilo Dutra Alves");
		funcionario.setCpf("33333333333");
		funcionario.setSalario(8000);
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Bonificacao: " + funcionario.getBonificacao());
	}
}
