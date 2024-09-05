package br.estacio.input;

import java.util.Scanner;

public class UsersInput {

	Scanner in;
	
	public String lerId() {
		
		System.out.println("Digite o id:");
		in = new Scanner(System.in);
		return in.nextLine();
		
	}
	
	public  String lerNome() {
		
		System.out.println("Digite o nome:");
		in = new Scanner(System.in);
		return in.nextLine();
		
	}
	
	public  String lerEmail() {
		
		System.out.println("Digite o email:");
		in = new Scanner(System.in);
		return in.nextLine();
		
	}
	
	
	
}
