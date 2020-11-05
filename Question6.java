package day7;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double weight=0;
		
		System.out.println("enter mass");
		int mass=scan.nextInt();
		weight=(mass*9.8);
		
		if(weight>=1000) {
			System.out.println("it is heavy");
			
		}else if(weight>=1000) {
			System.out.println("it is too light");
		
		}else {
			System.out.println("it is normal");
		
			
		}
		

	}

}
