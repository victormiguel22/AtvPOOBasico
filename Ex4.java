package exerciciobasico;

public class Ex4 {

	private double salB, salL, INSS, SDC, IR;

	public double getSalB() {
		return salB;
	}

	public void setSalB(double salB) {
		this.salB = salB;
	}

	public double getSalL() {
		return salL;
	}

	public void setSalL(double salL) {
		this.salL = salL;
	}

	public double getINSS() {
		return INSS;
	}

	public void setINSS(double iNSS) {
		INSS = iNSS;
	}

	public double getSDC() {
		return SDC;
	}

	public void setSDC(double sDC) {
		SDC = sDC;
	}

	public double getIR() {
		return IR;
	}

	public void setIR(double iR) {
		IR = iR;
	}
	
	public void calcINSS() {
		INSS = salB*0.08;
	}
	
	public void calcIR() {
		IR = salB*0.11;
		
	}
	
	public void calcSDC() {
		SDC = salB*0.05;
		
	}
	
	public void calcSL() {
		salL = salB - SDC - IR - INSS;
		
	}

	@Override
	public String toString() {
		return "+ Salário Bruto = R$" + salB + 
				"\n- IR = R$" + IR + 
				"\n- INSS = R$" + INSS + 
				"\n- Sindicato = R$" + SDC + 
				"\n= Salário Líquido = R$"+salL  ;
	}
	
	
	
}
