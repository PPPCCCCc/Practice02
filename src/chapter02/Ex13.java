package chapter02;
import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		double A;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자 : ");
		A = sc.nextDouble();
		
		double B;
		
		if (A<=0) {
			 B = A*A*A-9*A+2;
		}else {
			 B = 7*A+2;
		}
		
		System.out.println("계산결과는 " + B + "입니다.");
		sc.close();

	}

}
