package br.com.generation.Lacos;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int par = 0, impar = 0, n = 0;
		for (int num = 0; num < 10; num++) {
		    System.out.print("Digite um numero: ");
		    n = ler.nextInt();
		    
		   if (n % 2 == 0) {
			   System.out.println(" par ");
			   par++;
			   		   }             
		    else {
		    	System.out.println("impar");
		    	impar++;

	       }
		}
		System.out.println("exietem " + par + " numeros pares e " + impar + " numeros impares");
}
}

