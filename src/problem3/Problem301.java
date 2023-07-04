package problem3;

public class Problem301 {
	
	public static void main(String[] args) {
		
		int dice = (int) (Math.random()*10)+1;
		
		System.out.println(dice);
		
		if(dice >= 5) {
			System.out.println("5以上です");
		}if(dice != 1) {
			System.out.println("1ではありません");
		}
	}

}
