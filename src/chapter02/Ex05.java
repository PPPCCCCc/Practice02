package chapter02;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		double height, weight ;
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키 : ");
		height = sc.nextDouble();
		System.out.print("몸무게 : ");
		weight = sc.nextDouble();
		
		double bmi= (height-100)*0.9;
		
		if(bmi>weight) {
			System.out.println("저체중입니다.");
		}else if(bmi==weight) {
			System.out.println("표준입니다.");
		}else {
		System.out.println("과체중입니다.");
		}
	}

}
