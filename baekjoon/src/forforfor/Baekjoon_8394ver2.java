package forforfor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_8394ver2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		if(n%2==0) {
			sum = (n*(n+1))/2;
		}else {
			sum = (n*(n-1))/2+n;
		}
		System.out.println(sum);
	}
}
