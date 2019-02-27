
public class CollatzovoZaporedje {

	public static void main(String[] args) {
		System.out.println(dolzina(60));
		System.out.println(najvecji(60));
		izpisi(60);
	}
	
	public static int dolzina (int n) {
		int d = 1;
		while (n > 1) {
			if (n%2 == 0) n /= 2;
			else n = (3 * n) + 1;
			++d;
		}
		return d;
	}
	
	public static int najvecji (int n) {
		int x = 0;
		while (n > 1) {
			if (n%2 == 0) n /= 2;
			else n = (3 * n) + 1;
			if (n > x) x = n;
		}
		return x;
	}
	
	public static void izpisi (int n) {
		System.out.print(n);
		while (n > 1) {
			if (n%2 == 0) n /= 2;
			else n = (3 * n) + 1;
			System.out.print(" " + n);
		}
	}

}
