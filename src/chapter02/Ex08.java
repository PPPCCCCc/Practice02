package chapter02;
import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		int A, B, C;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요.");
		System.out.print("숫자1 : ");
		A = sc.nextInt();
		System.out.print("숫자2 : ");
		B = sc.nextInt();
		System.out.print("숫자3 : ");
		C = sc.nextInt();
		
		if(A<B) {
			if(A<C){
				System.out.println("가장 작은 수는 "+A+"입니다." );
			}else {
				System.out.println("가장 작은 수는 "+C+"입니다." );
			}
		}else if(B<C) {
			System.out.println("가장 작은 수는 "+B+"입니다." );
		}else {
			System.out.println("가장 작은 수는 "+C+"입니다." );
		}
	}

}
