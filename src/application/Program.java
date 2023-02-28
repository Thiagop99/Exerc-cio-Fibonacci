package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro: ");
		int number = sc.nextInt();
		
		boolean belongs = belongsInSequency(number);
		
		if (belongs) {
			System.out.println(number + " está na sequência de Fibonacci");
		}
		else {
			System.out.println(number + " não está na sequência de Fibonacci");
		}
		sc.close();
	}
	
	public static boolean belongsInSequency(int number) {
		int first = 0;
		int current = 1;
		
		while (current < number) {
			int next = first + current;
			first = current;
			current = next;
		}
		if (current == number) {
			return true;
		}
		else {
			return false;
		}
	}
}
