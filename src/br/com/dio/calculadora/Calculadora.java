package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o primeiro valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtra��o = subtra��o(a,b);
		float multiplica��o = multiplica��o(a,b);
		int divis�o = divis�o(a,b);
		
		System.out.println("soma " + soma);
		System.out.println("subtra��o " + subtra��o);
		System.out.println("multiplica��o " + multiplica��o);
		System.out.println("divis�o " + divis�o);
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int subtra��o(int a, int b) {
		return a - b;
	}
	
	public static int divis�o(int a, int b) {
		return a / b;
	}
	
	public static float multiplica��o(int a, int b) {
		return a * b;
	}

}
