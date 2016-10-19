package fcu.iecs.oop;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in) ;
		
		int num ;
		
		System.out.println("Please enter an integer: ") ;
		
		num=scanner.nextInt() ;
		
		if(num%2==1){
			
			System.out.println("The input integer is an Odd Number.") ;
			
		}
		
		else{
			
			System.out.println("The input integer is an Even Number.") ;
						
		}
		
		scanner.close() ;
		
	}

}