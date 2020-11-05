package day7;
import java.util.Scanner;
public class Question12 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Choice package A,B,C");
		
	    char letter=scan.next().charAt(0);
	    
	    System.out.println("Ussing hour");
	    int hour=scan.nextInt();
	    double money;
		switch (letter) {
			
			case 'A':
				
				if (hour>10) {
				money=(hour-10)*2+9.95;
				System.out.println("price="+money);
			}
			
			case 'B' :
				
				if(hour>20) {
				money=(hour-20)*1+13.95;
				System.out.println("price="+money);
			}
			case 'C' :
				money= 19.95;
				System.out.println("unlimited net,only price"+ money);
				break;
		}
		}
	
}
