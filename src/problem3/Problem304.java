package problem3;

public class Problem304 {

	public static void main(String[] args) {

		int dice = (int) (Math.random() * 100) + 1;

		System.out.println(dice);
		
		if(50 > dice) {
			System.out.println("50未満です");
			
		}if(10 >= dice || 90 <= dice) {
			System.out.println("10以下か90以上です");
		}else if(20 <= dice && 80 > dice) {
			System.out.println("20以上80未満です");
		}
	}
}
