package chapter02;
import java.util.Scanner;
public class Ex09 {

	public static void main(String[] args) {
		int A, B;
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자1 : ");
		A = sc.nextInt();
		System.out.print("숫자2 : ");
		B = sc.nextInt();
		
		if(A>B) {
			if(A%B==0){
				System.out.println(B+"는(은)"+A+"의 약수입니다");
			}else {
				System.out.println(B+"는(은)"+A+"의 약수가 아닙니다");
			}
		}if(A<B) {
			if(A%B==0){
				System.out.println(A+"는(은)"+B+"의 약수입니다");
			}else {
				System.out.println(A+"는(은)"+B+"의 약수가 아닙니다");
			}
		}
	}
}
