package jc04_first_ide_app;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите число a: ");
		int a = scanner.nextInt();

		System.out.print("Введите число b: ");
		int b = scanner.nextInt();

		int min;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}

		System.out.println("Наименьшее число: " + min);
	}
}
