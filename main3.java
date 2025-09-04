package exerciciobasico;
import java.util.Scanner;

public class main3 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	Ex3 ex3 = new Ex3();
	System.out.println("Digite os dois números para calcular as 4 operações: ");
	ex3.setNum1(sc.nextInt());
	ex3.setNum2(sc.nextInt());
	
	ex3.Calcular();
	
	System.out.println(ex3);
		
	}

}
