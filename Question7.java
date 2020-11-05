package day7;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int remainder,remainder2,minute,hour,day;
		
		System.out.println("enter a number of seconds");
		
		int number=scan.nextInt();
		
		minute=number/60;
		remainder=number%60;
		
		if(number>=60 && number<3600) {
			System.out.println(number+"seconds = "+minute+" minute "+remainder+" seconds ");
			
		}else if(number>=3600 && number<86400) {
			hour=number/3600;
			remainder=number%3600;
			if(remainder<60) {
				System.out.println(number+" seconds= "+hour+" hour "+remainder+" seconds");
				
			}else if(remainder>=60) {
				minute=remainder/60;
				remainder2=remainder%60;
				System.out.println(number+" seconds = "+hour+" hour "+minute+" minute "+remainder2+" seconds");
			}
			
		}else if(number>=86400) {
			day=number/86400;
			remainder=number%86400;
			
			if(remainder<60) {
				System.out.println(number+" seconds= "+day+" day"+remainder+" seconds ");
			}else if(remainder>=60) {
				minute=remainder/60;
				remainder2=remainder%60;
				System.out.println(number+" seconds= "+day+" day "+minute+" minute "+remainder2+" seconds");
				
			}
		}
		
			
		

	}

}
