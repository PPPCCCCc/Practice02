package chapter02;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		String C;
		double A, B;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호 : ");
		C = sc.nextLine();
		System.out.print("숫자1 : ");
		A = sc.nextDouble();
		System.out.print("숫자2 : ");
		B = sc.nextDouble();
		
		
		switch (C) {
		case "+":
			System.out.println("결과는 "+(A+B));
			break;
		case "-":
			System.out.println("결과는 "+(A-B));
			break;
		case "*":
			System.out.println("결과는 "+(A*B));
			break;
		case "/":
			if(B==0) {
				System.out.println("계산할 수 없습니다.");
			}else {
				System.out.println("결과는 "+(A/B));
			}
			break;
		default:
			System.out.println("계산할 수 없는 기호입니다.");
			break;			
		}
		
			
	}
}
