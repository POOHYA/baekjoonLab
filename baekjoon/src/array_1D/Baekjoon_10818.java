package array_1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon_10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer	st;
		
		int n = Integer.parseInt(br.readLine());
		String str = new String(br.readLine());
		int[] arr= new int[n];
		st = new StringTokenizer(str);
		
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			}
		Arrays.sort(arr);
		System.out.print(arr[0]+" ");
		System.out.print(arr[arr.length-1]);
		
	}

}
