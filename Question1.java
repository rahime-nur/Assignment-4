package day7;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		double bmi,mass,height;
		
		System.out.println("enter weight pound form");
		double weight=scan.nextDouble();
		
		System.out.println("enter height firstly feet and secondly inç form");
		
		double heigh=scan.nextDouble();
		double feet=scan.nextDouble();
		System.out.println("Your height in feet followed by a space then addition inches");
		
		heigh += feet*12;
		
		mass=weight/2.2;
		heigh=heigh*0.0254;
		bmi=mass/(heigh*heigh);
		System.out.println("mass"+mass);
		System.out.println("heigh"+heigh);
		System.out.println("bmi"+bmi);
		
		
		if(bmi<18.5) {
			System.out.println("underweight "+bmi);
				
		}else if((bmi>=18.5)&&(bmi<25)) {
		     System.out.println("normal weight");
	
		
	    }else if ((bmi>=25)&&(bmi<30)) {
		      System.out.println("overweight");
	    }else if (bmi>=30) {
	    	  System.out.println("obese");
		   
		   
		   
			
		}

	}

}
