package exerciciobasico;
import java.util.Scanner;
public class main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ex2 ex2 = new Ex2();

		System.out.println("Digite o primeiro número do intervalo: ");
		ex2.setNum1(sc.nextInt());
		System.out.println("Digite o segundo número do intervalo: ");
		ex2.setNum2(sc.nextInt());
		
		ex2.mostrarIntervalo();
		
	}

}
