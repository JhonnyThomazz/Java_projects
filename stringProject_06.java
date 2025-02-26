package Projetos_LPA_JT.aula05;

import java.util.Scanner;

public class stringProject_06 {

	public static void main(String[] args) {
		String frase;
		String TRIAL = "olá mundo";
		int caractere;
		Scanner ler = new Scanner(System.in);
		System.out.println("digite sua frase: ");
		frase = ler.nextLine();

		int tamanho = frase.length();
		System.out.println("o tamanho é " + tamanho);

		System.out.println("informe o caractere desejado: ");
		caractere = ler.nextInt();

		char letra = frase.charAt(caractere);
		System.out.println("seu caractere é: " + letra);

		if (frase.equals(TRIAL))
			System.out.println("Sua frase é igual a do sistema: olá mundo");

	}

}
