package day7;
import java.util.Scanner;
public class Question13 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Check number");
		
		int check=scan.nextInt();
	    int fee=10;
	    double price;
	    
		
		if(check<20) {
			price=check*0.1;
			
			System.out.println("price "+(price + fee));
			}
		else if(check>=20 && check<=39) {
			price=check*0.08;
			System.out.println("price "+(price + fee));
		}
		else if(check>=40 && check<=59){
			price=check*0.06;
			System.out.println("price "+(price + fee)); }
	   else if(check>=60){
			price=check*0.04;
			System.out.println("price "+(price + fee));	
		}
		
		}

	}
