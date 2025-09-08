package exerciciobasico;
import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean harrypotter = true;
		int codigo;
		
		Ex5 ex5 = new Ex5();
		
		System.out.println("---Bem-vindo à lanchonete---");
		
		while (harrypotter) { 
			
		
		System.out.println("Especificação  Código  Preço");
		System.out.println("Cachorro Quente  100   R$ 1,20");
		System.out.println("Bauru Simples    101   R$ 1,30");
		System.out.println("Bauru com ovo    102   R$ 1,50");
		System.out.println("Hambúrguer       103   R$ 1,20");
		System.out.println("Cheeseburguer    104   R$ 1,30");
		System.out.println("Refrigerante     105   R$ 1,00");
		System.out.println("Digite 0 para sair");

		
		System.out.println("Digite o código do que quer pedir: ");
		codigo = sc.nextInt();
		if (codigo!= 0) {
		System.out.println("Quantas unidades?: ");
		ex5.setQtd(sc.nextInt());
		}
		
		switch (codigo) {
		
		case (100):
			ex5.setPreco(1.20);
		break;
		
		case (101):
			ex5.setPreco(1.30);
		break;
		
		case (102):
			ex5.setPreco(1.50);
		break;
		
		case (103):
			ex5.setPreco(1.20);
		break;
		
		case (104):
			ex5.setPreco(1.30);
		break;
		
		case (105):
			ex5.setPreco(1);
		break;
		
		case (0):
			System.out.println("Seu total ficou: R$"+ (float)ex5.getSubtotal());
			harrypotter = false;
		break;
		
		}
		
		if (harrypotter) {
		ex5.Calcular();
		System.out.println(ex5);
		}
	}		
}
}
