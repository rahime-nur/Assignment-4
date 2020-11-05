package day7;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		double discount,net,total;
		double quantity=scan.nextDouble();
		int money=100;
		System.out.println("how many package buy?");
		
		if(quantity>=10 && quantity<=19) {
			total=quantity*money;
			discount=quantity*money*20/100;
			net=total-discount;
			System.out.println("before discount="+total+" after discount="+net+"total discount="+discount);
		}else if (quantity>=20 && quantity<=49) {
			total=quantity*money;
			discount=quantity*money*30/100;
			net=total-discount;
			System.out.println("before discount="+total+" after discount="+net+" total discount="+discount);
		}else if(quantity>=50 && quantity<=99) {
			discount=quantity*money*40/100;
			total=quantity*money;
			net=total-discount;
			System.out.println("before discount ="+total+" after discount="+net+" total discount="+discount);
			}
	    else if(quantity>=100) {
		    total=quantity*money;
		    discount=quantity*money*50/100;
		    net=total-discount;
		    
		    System.out.println("before discount ="+total+" after discount="+net+" total discount="+discount);
		}
	    
	    else {
	    	System.out.println("no discount");
	    	

	}
	}
}
