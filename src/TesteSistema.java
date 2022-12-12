
public class TesteSistema {
	public static void main(String [] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		ClienteDaEmpresa cliente = new ClienteDaEmpresa();
		cliente.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(gerente);
		si.autentica(adm);
		si.autentica(cliente);
	}
}
