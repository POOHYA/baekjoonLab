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
	        String s = bf.readLine();   // �Է��� 5 4 �� ����
	        StringTokenizer st = new StringTokenizer(s);
	        int a = Integer.parseInt(st.nextToken());  //5
	        int b = Integer.parseInt(st.nextToken());  //4
	 
	        String p = "abcedf";
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        bw.write(p + "\n");
	 
	 
	        bw.flush();
	        bw.write("3");

	 
	        bw.write(String.valueOf(b));  // write�� String���� ����� �����ϹǷ� ������ String���� ��ȯ�ؾ���
	 
	        bw.flush();
	        bw.close();
	    }
	}
