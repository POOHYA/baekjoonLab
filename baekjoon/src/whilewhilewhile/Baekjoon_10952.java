package whilewhilewhile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baekjoon_10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = new String();
		int a = 1,b = 1;
		
		while(true) {
			str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);

			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			if(!(a == 0 && b == 0)) {
			bw.write((a+b)+"\n");
			}else break;			
		}
		bw.flush();
		bw.close();
				
	}

}
