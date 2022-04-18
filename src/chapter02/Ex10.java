package chapter02;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		int A;
		Scanner sc = new Scanner(System.in);

		System.out.println("사번(정수)를 입력해주세요 ");
		System.out.print("사번 : ");
		A = sc.nextInt();
		
			if(A%3==0){
				System.out.println("A팀입니다.");
			}else if(A%3==1){
				System.out.println("B팁입니다.");
			}else if(A%3==2){
				System.out.println("C팁입니다.");
			}else{
				System.out.println("잘못입력하셨습니다.");
			}
	}
}

