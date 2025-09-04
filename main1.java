package exerciciobasico;
import java.util.Scanner;
public class main1 {

	public static void main(String[] args) {
		
		Ex1 ex1 = new Ex1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?");
		ex1.setNome(sc.nextLine());
		System.out.println("Qual o seu sobrenome?");
		ex1.setSobrenome(sc.nextLine());
		
		System.out.println("Seu nome é "+ex1.NomeCompleto());
		
		
	}

}
