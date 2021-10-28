package array_1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Baekjoon_2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int sum = a*b*c;
		int[] sumarr = Stream.of(String.valueOf(a * b * c).split("")).mapToInt(Integer::parseInt).toArray();
		
		for (int i = 0; i < sumarr.length; i++) {
			count[sumarr[i]]++;
		}
		for (int i = 0; i < 10; i++) {
		System.out.println(count[i]);
		}
	}
}
