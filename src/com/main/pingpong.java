package com.main;
import java.util.Scanner;

public class pingpong {
	public static void main(String args[]) 
	{
		
	Scanner scan = new Scanner(System.in);
	System.out.println ("PingPong- Enter a number:") ;
	//capture the input in an integer
	int num=scan.nextInt();

	    if( num % 3 == 0 ) {
	    	System.out.println("ping") ;
	    }
	    else if( num % 5 == 0 ) {
	    	System.out.println ("pong") ;
	    }
	    else if( ( num % 3 == 0 ) && ( num % 5 == 0 ) ) {
	    	System.out.println("pingpong") ;
	    }
	    else if( ( num % 3 != 0 ) && ( num % 5 != 0 ) ) {
	    	System.out.println(num) ;
	    }
	}
}
