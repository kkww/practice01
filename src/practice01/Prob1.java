package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수를 입력하십시오 : ");
		if(scanner.nextInt() % 3 == 0)
			System.out.println("3의 배수입니다.");
		
		scanner.close();
	}
}
