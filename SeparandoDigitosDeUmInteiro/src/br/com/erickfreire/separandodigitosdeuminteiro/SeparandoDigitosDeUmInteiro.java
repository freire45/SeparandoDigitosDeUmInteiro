package br.com.erickfreire.separandodigitosdeuminteiro;

import java.util.Scanner;

/**
 * Crie um programa em Java que recebe um valor em caractere e informa o número dele na tabela ASCII
 * @author Erick Freire
 * @version 1 - Criado em 27-03-2021 as 23:18
 */

public class SeparandoDigitosDeUmInteiro {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um valor de 5 digitos: ");
		numero = entrada.nextInt();
		
		if(numero < 10000)
			System.out.print("Numero muito pequeno! Programa finalizado.");
		
		if(numero > 99999)
			System.out.print("Número muito grande! Programa finalizado");
		
		if(numero > 9999) {
			if(numero < 100000) {
				System.out.printf("%d ", (numero / 10000));
				System.out.printf("%d ", ((numero % 10000) / 1000));
				System.out.printf("%d ", ((numero % 1000) / 100));
				System.out.printf("%d ", ((numero % 100) / 10));
				System.out.printf("%d ", ((numero % 10) / 1));
				
			}
		}
			
	}

}
