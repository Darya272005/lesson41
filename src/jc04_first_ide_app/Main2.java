package jc04_first_ide_app;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner (System.in);
		
		System.out.print("Введите число a:");
		
		int a=scanner.nextInt();
		
		if(a<3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		if (a==2) {
			System.out.println("Числа равны:");
		} else {
			System.out.println("Числа не равны:");
		}
	}
}
