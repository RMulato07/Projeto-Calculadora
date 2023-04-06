package prjCauculadora1;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double n1,n2;
		Scanner in = new Scanner (System.in);
		Calculadora calc = new Calculadora();
		System.out.println("Digite o primeiro numero");
		calc.n1 = in.nextDouble();
		System.out.println("Digite o segundo numero");
		calc.n2 = in.nextDouble();
		
		calc.soma();
		System.out.println("soma dos dois numeros é " +calc.resultado);
		
		System.out.println("subtrscao de dois numeros é "+calc.subtracao());
		
		calc.multiplicacao(2, 7);
		System.out.println("a multiplicaçao dos dois numeros é"+calc.resultado);
		
		System.out.println(calc.divisao(5, 2));
	}

}

