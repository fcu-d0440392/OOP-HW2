package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0 ;
		
		while (i==0) {
			
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter two strings") ;
		String str1 = scanner.next() ;
		String str2 = scanner.next() ; 
		
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("The two strings are the same.") ;
			i+=1 ;
		}
		else{
			System.out.println("The two strings are not the same.") ;
			
		}
			
	}
	}
}