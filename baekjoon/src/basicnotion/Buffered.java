package basicnotion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Buffered {
	 public static void main(String[] args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	     String s = bf.readLine();
	     int i = Integer.parseInt(s);
	     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 }
}