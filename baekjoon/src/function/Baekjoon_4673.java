package function;

public class Baekjoon_4673 {

	public static void main(String[] args) {
		int str[] = new int[20000];

		int result = 0;
		int a;

		for (int i = 1; i <= 10000; i++) {
			result = 0;
			a = i;
			while (a >= 1) {
				result += a % 10;
				a /= 10;
			}
			str[i + result] = i + result;
		}
		for (int i = 1; i <= 10000; i++) {
			if (str[i] == 0) {
				System.out.println(i);
			}
		}

	}

}