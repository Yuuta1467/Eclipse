package problem3;

public class Problem312 {
	public static void main(String[] args) {
		int num = (int) (Math.random()*21)-10;
		System.out.println(num);
		
		if(0 > num) {
			System.out.println("負の値");
		}else if(0 < num) {
			System.out.println("正の数");
		}else {
			System.out.println("0です");
		}
	}
}
