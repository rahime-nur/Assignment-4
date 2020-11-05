package day7;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double pay;
	
		System.out.println("your income:");
		double income=scan.nextDouble();
		
		
		if(income<=150_000_000) {
			pay=(income)*(25/1000);
			System.out.println("The tax amount you have to pay"+pay);
			
		}else if(income<=300_000_000) {
			pay=(income-150_000_000)*(0.3)+(150_000_000)/4;
			System.out.println("The tax amount you have to pay"+pay);
			
		}else if(income<=600_000_000) {
			pay=((income-300_000_000)*0.35)+(300_000_000-150_000_000)*(0.3)+(150_000_000/4);
			System.out.println("The tax amount you have to pay"+pay);
		
		}else if(income<=1_200_000_000) {
			pay=((income-600_000_000)*0.4)+((600_000_000-300_000_000)*0.35)+((300_000_000-150_000_000)*(0.3))+(150_000_000/4);
			System.out.println("The tax amount you hav to pay"+pay);
			
		}else if(income>1_200_000_000) {
			pay=(income-1_200_000_000*(50/100))+(1_200_000_000*0.4)+((600_000_000-300_000_000)*0.35)+((300_000_000-150_000_000)*(0.3))+(150_000_000/4);
			System.out.println("The tax amount you have to pay"+pay);
			
		}
		
}
 }