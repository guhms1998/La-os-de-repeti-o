package br.com.generation.Lacos;

import java.util.Scanner;

public class ex3 {
	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99.*/
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, anos21 = 0, anos50 = 0;
		
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
		while(idade != -99) {
			
			
			if(idade <= 21) {
				anos21++;
			}
			else if(idade >= 50) {
				anos50++;
			}
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println(anos21 + " " + anos50);
		
	
		
		
				
		
	}

}
