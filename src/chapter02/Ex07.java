package chapter02;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		int A, B ;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1 : ");
		A = sc.nextInt();
		System.out.print("숫자2 : ");
		B = sc.nextInt();
		
		int C = A/B;
		int D = A%B;
		
		System.out.println("몫 : " +C +"\n나머지 : " + D);	
	}

}
