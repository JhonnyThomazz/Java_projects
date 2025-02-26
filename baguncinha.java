package Projetos_LPA_JT.aula05;

import java.util.Scanner;

public class baguncinha {

	public static void main(String[] args) {
		String frase;
		Scanner ler = new Scanner(System.in);
		System.out.println("digite sua frase: ");
		frase = ler.nextLine();
		int tamanho = frase.length();
		System.out.println("o tamanho é " + tamanho);
	}

}
