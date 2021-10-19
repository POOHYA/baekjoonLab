package forforfor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_10871 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = new String(br.readLine());
		
		StringTokenizer st = new StringTokenizer(s);
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		String a = new String(br.readLine());
		String[] arr = a.split(" ");

		int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		
		for (int i = 0; i < N; i++) {
			if (nums[i] < X) {
				bw.write(arr[i]+" ");
			}
		}
		bw.flush();
		bw.close();
	}

}

