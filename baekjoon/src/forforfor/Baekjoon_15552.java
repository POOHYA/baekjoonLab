package forforfor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int total = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < total; i++) {
			String str[] = br.readLine().split(" ");
			bw.write(Integer.parseInt(str[0])+Integer.parseInt(str[1])+"\n");
		}
		bw.flush();
		bw.close();
	}

}
