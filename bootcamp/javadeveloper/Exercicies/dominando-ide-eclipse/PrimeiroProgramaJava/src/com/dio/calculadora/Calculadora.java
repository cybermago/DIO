package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a,b;
		
		System.out.println("1:");
		a = scan.nextInt();
	    System.out.println("2:");
	    b = scan.nextInt();
	    
		int soma = soma(a,b); 
		int sub = sub(a,b);
		int multi = multi(a,b);
		int div = div(a,b);
		
		System.out.println(soma);
		System.out.println(sub);
		System.out.println(multi);
		System.out.println(div);
		
	}

	public static int soma(int a,int  b) {
		return a+b;
	}
	
	public static int sub(int a,int  b) {
		return a-b;
	}	
	public static int multi(int a, int b) {
		return a*b;
	}

	public static int div(int a, int b) {
		return a/b;
	}
	
}
