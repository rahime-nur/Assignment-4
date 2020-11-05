package day7;
import java.util.Scanner;
public class Question14 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Check number");
		
		int book=scan.nextInt();
		
		if(book==0) {
			System.out.println(book+" books "+0+" point");
		}
		else if(book==1) {
				System.out.println(book+" books "+5+" point");
	
		}
		else if(book==2) {
			System.out.println(book+" books "+15+" point");
	}
		else if(book==3) {
			System.out.println(book+" books "+30+" point");
			
}
		else if(book>=4) {
			System.out.println(book+" books "+60+" point");
		}
	}
}