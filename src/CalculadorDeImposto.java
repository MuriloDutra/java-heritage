
public class CalculadorDeImposto {
	private double totalImposto;
	
	public void registra(Tributavel produto) {
		this.totalImposto += produto.getValorImposto();;
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
}
