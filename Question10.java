package day7;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		int percent;
		System.out.println("enter calori");
		int calori=scan.nextInt();
		
		System.out.println("enter fat grams");
		int gram=scan.nextInt();
		
		percent=100*(gram*9)/calori;
		
		if(percent<(calori*0.3)) {
			System.out.println("food is low in fat");
		}if((gram*9)>calori) {
			System.out.println("input is invalid");
			
		}
			System.out.println("percent of calories from fat "+percent);
			

	}

}
