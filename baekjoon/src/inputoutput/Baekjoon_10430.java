package inputoutput;

import java.util.Scanner;

public class Baekjoon_10430 {

	public static void main(String[] args) {
		//ģ²«ģ§ø ģ¤ģ (A+B)%C, ?ģ§? ģ¤ģ ((A%C) + (B%C))%C, ?ģ§? ģ¤ģ (AĆB)%C, ?·ģ§? ģ¤ģ ((A%C) Ć (B%C))%Cė„? ģ¶ė „??¤.
		
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
