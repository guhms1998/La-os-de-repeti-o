package br.com.generation.Lacos;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		int i = 0, numero = 0, soma = 0;
		double media;
		
		do {
			System.out.println("digite um numero: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				soma = soma + numero;
				i++;
				
			}
			media = soma / 1;
			System.out.println(media);
		}
		while(numero != 0);

	}

}
