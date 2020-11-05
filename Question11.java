package day7;
import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Choice medium;air,water,steel");
		double time;
	    String medium=scan.next();
	    
	    System.out.println("Ussing distance");
		
	    double distance=scan.nextDouble();
	    switch (medium) { 
	    
	    case "air":
	    time=distance/1100;
	    System.out.println("time="+time);
	    break;
	    
	    case "water":
		    time=distance/4900;
		    System.out.println("time="+time);
		    break;
		    
	    case "steel":
		    time=distance/16400;
		    System.out.println("time="+time);
		    break;
		    
	    }

	}
	
		
		
}		