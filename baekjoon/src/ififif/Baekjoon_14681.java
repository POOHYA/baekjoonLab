package ififif;

import java.util.Scanner;

public class Baekjoon_14681 {
	static final int MAX = 1000;
	static final int MIN = -1000;
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>=MIN && x<0) {
			if(y>=MIN && y<0) 
				System.out.println("3");
				else
					System.out.println("2");
			
		}else if (x<=MAX && x>0) {
			if(y<=MAX && y>0) 
				System.out.println("1");
				else
					System.out.println("4");
		}

	}

}
