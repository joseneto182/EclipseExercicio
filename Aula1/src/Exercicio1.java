import java.util.Scanner;
/*Escreva um algoritmo para ler um valor (do teclado) e 
escrever (na tela) o seu antecessor.*/
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int valor = leia.nextInt();
		
		int antecessor = valor - 1;
		System.out.println("Antecessor: "+antecessor);
	}

}
