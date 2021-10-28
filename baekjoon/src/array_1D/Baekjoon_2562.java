package array_1D;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Baekjoon_2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max=0;
		int num=0;
		
		for(int i=0; i<9; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			if (max < arr[i]) {
		        max = arr[i];
		        num = i+1;
		    }
		}
		System.out.println(max+"\n"+num);
	}

}
