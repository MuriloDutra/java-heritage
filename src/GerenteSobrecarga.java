
public class GerenteSobrecarga extends Funcionario{
	private int senha;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
	
	/* Repare que criamos uma nova versão do método autentica. 
	 * Agora temos dois métodos autentica na mesma classe que variam na quantidade ou tipos de parâmetros.
	 * Isso se chama sobrecarga de métodos. A sobrecarga não leva em conta a visibilidade ou retorno do método,
	 * apenas os parâmetros e não depende da herança.
	 */
	public boolean autentica(String login, int senha) {
		//Alguma implementacao aqui...
		return false;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return super.getSalario();//Este atributo é da classe mae
	}	
}
