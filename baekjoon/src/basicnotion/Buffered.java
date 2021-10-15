package basicnotion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Buffered{
	  public static void main(String[] args) throws IOException {
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        String s = bf.readLine();   // 입력을 5 4 로 받음
	        StringTokenizer st = new StringTokenizer(s);
	        int a = Integer.parseInt(st.nextToken());  //5
	        int b = Integer.parseInt(st.nextToken());  //4
	 
	        String p = "abcedf";
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        bw.write(p + "\n");
	 
	 
	        // write한다고 해서 바로바로 출력되지 않는다.
	        // 직접 출력 stream에 반영되는 것이 아니라 성능을 위해 buffer에 저장해두었다가
	        // BufferedWriter가 flush되거나 close되었을 때 한번에 출력 stream에 반영하기 때문이다.
	        bw.flush();
	        bw.write("3");
	 
	        // close는 stream을 닫아버리기 때문에 계속 출력하고자 한다면 flush 사용한다.
	        // bw.close();
	 
	        // 출력내용에 줄바꿈이 필요하다면 newLine 함수를 사용한다.
	        bw.write(String.valueOf(b));  // write는 String형만 출력이 가능하므로 정수는 String으로 변환해야함
	 
	        bw.flush();
	        bw.close();
	    }
	}
