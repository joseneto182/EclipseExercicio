import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float v1, v2, soma, produto, divisao, resto;
		
		System.out.println("Digite um valor");
		v1 = entrada.nextFloat();
		
		System.out.println("Digite outro valor:");
		v2 = entrada.nextFloat();
		
		soma = v1 + v2;
		produto = v1 * v2;
		divisao = v1 / v2;
		resto = v1 % v2;
		
		System.out.println("Soma: "+soma);
		System.out.println("Produto: "+produto);
		System.out.println("Divisão: "+divisao);
		System.out.println("Resto: "+resto);

	}

}
