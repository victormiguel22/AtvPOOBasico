package exerciciobasico;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
	
		Ex4 ex4 = new Ex4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salário bruto: ");
		ex4.setSalB(sc.nextDouble());
		
		ex4.calcIR();
		ex4.calcINSS();
		ex4.calcSDC();
		ex4.calcSL();
		
		System.out.println(ex4);
	}

}
