package forforfor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_10950ver1 {

//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int count = Integer.parseInt(br.readLine());
//		String a = new String();
//		
//		for(int i=0;i<count;i++){
//			a = br.readLine();
//			StringTokenizer st=new StringTokenizer(a);
//			System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
//		}
//
//	}
//
//}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++) {
            String[] input = br.readLine().split(" ");
            int firstNum = Integer.parseInt(input[0]), secondNum = Integer.parseInt(input[1]);
            bw.write(firstNum + secondNum + "\n");
        }

        bw.flush();
        bw.close();
    }
}