package ififif;

import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		if(hour<24 && hour>0) {
			if(minute-45<0) {
				minute = 60 + minute - 45;
				hour = --hour;
			} else if (minute-45>=0) {
				minute = minute-45;
				} else {
					System.out.println("�߸��Է��Ͽ����ϴ�");
				}
		} else if (hour==24){
			if(minute-45<0) {
				minute = minute - 45;
				hour = --hour;
			} else if (minute-45>=0) {
				minute = minute-45;
				} else {
					System.out.println("�߸��Է��Ͽ����ϴ�");
				}
		} else if(hour==0){
			if(minute-45<0) {
				minute = 60 + minute - 45;
				hour = 23;
			} else if (minute-45>=0) {
				minute = minute-45;
				} else {
					System.out.println("�߸��Է��Ͽ����ϴ�");
				}
		} else {
			System.out.println("�߸��Է��Ͽ����ϴ�");
		}
		System.out.print(hour+" "+minute);
	}
}
