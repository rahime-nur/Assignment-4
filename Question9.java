package day7;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Declare the weight of the package");
		
		int weight=scan.nextInt();
		System.out.println("Enter the mile");
		int mileData = scan.nextInt();
		int mile=((mileData-1)/500)+1;
		double fee=0;
		if(weight<=2)
			fee=1.10;
		else if (weight<=6)
			fee=2.20;
		else if(weight<=10)
			fee=3.70;
		System.out.println("The shipping cahrge is $ "+ fee*mile);
		
	}
}

