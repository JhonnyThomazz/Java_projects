package Projetos_LPA_JT.aula05;

import java.util.Scanner;

public class if_else_01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int número;
		
		System.out.println("informe o número: ");
		número = ler.nextInt();
		
		if (número > 10) System.out.println("o número é maior que 10");
		
		ler.close();
	}

}
