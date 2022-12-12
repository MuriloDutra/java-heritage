
public class TesteReferencia {
	public static void main(String [] args) {
		Gerente gerente = new Gerente();
		EditorDeVideo editor = new EditorDeVideo();
		Designer designer = new Designer();
		
		gerente.setNome("Murilo Dutra Alves");
		gerente.setSalario(5000);
				
		editor.setNome("Juliana Okubo");
		editor.setSalario(2500);
		
		designer.setNome("Paulo Lacerda");
		designer.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(editor);
		controle.registra(designer);
		
		System.out.println("Soma: " + controle.getSoma());
	}
}
