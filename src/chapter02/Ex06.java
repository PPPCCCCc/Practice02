package chapter02;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		int A, B ;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("숫자1 : ");
		A = sc.nextInt();
		System.out.print("숫자2 : ");
		B = sc.nextInt();
		
		if(A>B) {
			System.out.println("큰 수 : " +A);
			System.out.println("작은 수 : "+B);
		}else{
			System.out.println("큰 수 : "+B);
			System.out.println("작은 수 : "+A);
		}
	}

}
