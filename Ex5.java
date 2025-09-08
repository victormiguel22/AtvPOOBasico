package exerciciobasico;

public class Ex5 {

	private int qtd;
	private double subtotal = 0, preco;
	
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	public void Calcular() {
		subtotal += (preco*qtd);	
		System.out.println("Seu subtotal é: R$" + (float)subtotal);
	}
	@Override
	public String toString() {
		return "Seu subtotal é: R$" + (float)subtotal;
	}	
	
	
}

