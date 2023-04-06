package prjCauculadora1;
public class Calculadora {
	
	double n1;
	double n2;
	double resultado;
	
	public void soma(){
		resultado = n1 + n2;
	}
	public double subtracao(){
		resultado = n1 - n2;
		return resultado;
	}
	public void multiplicacao(double n1, double n2 ){
		this.n1=n1;
		this.n2=n2;
		resultado = n1 * n2;
	}
	public double divisao(double n1, double n2){
		this.n1=n1;
		this.n2=n2;
		resultado = n1 / n2;
		return resultado;
	}
}