package inputoutput;

import java.util.Scanner;

public class Baekjoon_10430 {

	public static void main(String[] args) {
		//첫째 줄에 (A+B)%C, ?���? 줄에 ((A%C) + (B%C))%C, ?���? 줄에 (A×B)%C, ?���? 줄에 ((A%C) × (B%C))%C�? 출력?��?��.
		
	Scanner sc = new Scanner(System.in);
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	
	System.out.println((A+B)%C);
	System.out.println(((A%C) + (B%C))%C);
	System.out.println((A*B)%C);
	System.out.println(((A%C)*(B%C))%C);
	
	}

}
