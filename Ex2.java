package exerciciobasico;

public class Ex2 {
		
	private int num1;
    private int num2;

    // Getters e Setters
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

    public void inverter() {
        int aux = num1;
        num1 = num2;
        num2 = aux;
    }

    public void mostrarIntervalo() {
        if (num1 > num2) {
            System.out.println("Valores trocados. Invertendo...");
            inverter();
        }

        System.out.println("Números no intervalo entre " + num1 + " e " + num2 + ":");
        for (int i = (num1+1); i < num2; i++) {
            System.out.print(i + " ");
        }
    }
}
