package day7;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a year");
		
		int year=scan.nextInt();
		
		if((year%100==0)&&(year%400==0)) {
			System.out.println(year+"Leap Year");
			
		}else if(year%4==0) {
			System.out.println(year+" "+"Leap Year");
			
		}else {
			System.out.println("it is not Leap Year");
			
			
		}
		
			

	}

}
