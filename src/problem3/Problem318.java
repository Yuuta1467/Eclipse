package problem3;

public class Problem318 {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*46)-10;
		System.out.println("摂氏"+ num +"度");
		
		if(30 <= num) {
			System.out.println("真夏日です");
		}else if(30 > num && 25<= num) {
			System.out.println("夏日です");
		}else if(0 > num) {
			System.out.println("真冬日です");
		}
	}
}