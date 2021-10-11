package ififif;

import java.util.Scanner;

public class Baekjoon_2884ver2 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int hour = sc.nextInt();
	int minute = sc.nextInt();
	int tmp = hour * 60 + minute - 45;
	
	if (tmp>0) {hour = tmp/60; minute = tmp%60;}
	 else {hour = 23; minute = 60 + tmp;}
	
	System.out.println(hour + " " + minute);
	
	}
}