package array_1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon_3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int[] ex = new int[10];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			ex[i] = arr[i]%42;
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(ex[i]!=ex[i+1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
