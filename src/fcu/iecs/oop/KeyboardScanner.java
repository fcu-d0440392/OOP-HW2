package fcu.iecs.oop;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Please enter an integer") ;
		int integer = scanner.nextInt() ;
		System.out.println("Please enter a float point number") ;
		float number = scanner.nextFloat() ;
		System.out.println("Please enter a you name") ;
		String name = scanner.next() ;
		
		System.out.printf("Hi %s, the multiplication of %d and %f is %2.2e",name,integer,number,(integer*number)) ;
	}
}