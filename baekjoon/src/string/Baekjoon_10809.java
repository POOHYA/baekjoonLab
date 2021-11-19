package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		String result = new String("");

		for (int j = 'a'; j <= 'z'; j++) {
				result += S.indexOf(j) + " ";
		}
		System.out.println(result);
	}
}
