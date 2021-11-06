package function;

public class Baekjoon_4673ver2 {

	public static void main(String[] args) {
		int[] selflist = new int[12000];
		for (int i = 1; i <= 10000; i++) {
			selflist[init(i)] = init(i);
		}
		for (int j = 1; j <= 10000; j++) {
			if (selflist[j] == 0) {
				System.out.println(j);
			}
		}

	}

	public static int init(int a) {
		int sum = a;
		while (a >= 1) {
			sum += a % 10;
			a /= 10;
		}
		return sum;
	}
}