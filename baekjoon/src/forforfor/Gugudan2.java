package forforfor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dan = Integer.parseInt(br.readLine());	//예외처리 필수
		br.close();
		
		for(int i=1; i<10; i++) {
			System.out.println( dan + " * " + i + " = " + dan * i);	
		}
	}

}
