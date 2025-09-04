package exerciciobasico;

public class Ex3 {

	private int num1, num2, soma, sub;
	private double mult, div;
	
	public int getNum1() {
		return num1;
	}



	public void setNum1(int num1) {
		this.num1 = num1;
	}



	public int getNum2() {
		return num2;
	}



	public void setNum2(int num2) {
		this.num2 = num2;
	}



	public void Calcular() {
		soma = num1 + num2;
		sub = num1 - num2;
		div = num1/num2;
		mult = num1*num2;
		
		/*System.out.println("As 4 operações dos números fornecidos são: ");
		System.out.println("Soma = "+soma);
		System.out.println("Subtração = "+sub);
		System.out.println("Divisão = "+div);
		System.out.println("Multiplicação = "+mult);*/	
	}


	@Override
	public String toString() {
		return "Ex3 [soma=" + soma + ", sub=" + sub + ", mult=" + mult + ", div=" + div + "]";
	}
	
		
		
		
	
}
