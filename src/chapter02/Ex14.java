package chapter02;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해주세요");
		System.out.print("금액 : ");
		int A = sc.nextInt();
		
		double a1 = 0.09 * A;
		double a2 =1000 * 0.09 + 0.18 * (A - 1000);
		double a3 =1000 * 0.09+3000 * 0.18 + 0.27 * (A - 4000);
		double a4 = 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36 * (A - 8000);
		
		if (A >= 0 && 1000 >= A) {
			 System.out.println("소득세는 " + a1 + "입니다.");
		}else if(1000 < A && A <= 4000){
			 System.out.println("소득세는 " + a2 + "입니다.");
		}else if(A < 8000 && A > 4000){
			 System.out.println("소득세는 " + a3 + "입니다.");
		}else if(A >= 8000){
			 System.out.println("소득세는 " + a4 + "입니다.");
		}else
			System.out.println("잘못 입력했습니다.");
		sc.close();
	}

}
