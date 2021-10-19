package forforfor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());


		String[] str = new String[N+1];
		str[0] = "";
		
		for(int i = 1; i <= N; i++) {
			str[i] = str[i-1]+"*";
			System.out.println(str[i]);
			
		}
	}

}
