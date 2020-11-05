package day7;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double pay;
		
		System.out.println("enter call number");
		int call_number=scan.nextInt();
		
		if(call_number==100) {
			pay=200;
			System.out.println("you will pay 200$");
			
		}else if(call_number>100 && call_number<=200) {
			if((call_number-100)<=50) {
				pay=((call_number-100)*(0.6))+200;
				System.out.println("payment"+pay);
			
			}if((call_number-100)>50) {
				pay=(int)((call_number-100)*0.5)+200;
				System.out.println("payment"+pay);
				
				}
		}else if(call_number>200) {
			pay=(int)((call_number-200)*(0.4))+200;
			System.out.println("payment"+pay);
			
			}
		}
      
}