package inputoutput;

import java.util.Scanner;

public class Baekjoon_2588 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int arr1 = sc.nextInt();
		int arr2 = sc.nextInt();
		
		System.out.println(arr1*(arr2%10));
		System.out.println(arr1*(arr2%100/10));
		System.out.println(arr1*(arr2/100));
		
		System.out.println(arr1*arr2);	
	}

}
