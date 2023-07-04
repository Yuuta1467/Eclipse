package problem3;

public class problem314 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 10) + 1;
		System.out.println(a);

		int b = (int) (Math.random() * 10) + 1;
		System.out.println(b);

		if (a > b) {
			System.out.println("aの方が大きい");
		}else if (b > a) {
			System.out.println("bの方が大きい");
		}else
			System.out.println("等しい");
	}
}