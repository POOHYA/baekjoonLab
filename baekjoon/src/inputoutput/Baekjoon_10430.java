package inputoutput;

import java.util.Scanner;

public class Baekjoon_10430 {

	public static void main(String[] args) {
		//ì²«ì§¸ ì¤„ì— (A+B)%C, ?‘˜ì§? ì¤„ì— ((A%C) + (B%C))%C, ?…‹ì§? ì¤„ì— (AÃ—B)%C, ?„·ì§? ì¤„ì— ((A%C) Ã— (B%C))%Cë¥? ì¶œë ¥?•œ?‹¤.
		
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
