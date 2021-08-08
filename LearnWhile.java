package week1.day1;

public class LearnWhile {
	public static void main(String[] args) {
		int number = 123;
		int sum=0;
		int remainder;
		while(number>0) {
			remainder = number % 10;  
			System.out.println("The remainder is:"+remainder);
			sum  = sum + remainder;  
			number = number / 10;  
		}
		System.out.println("The sum is :"+sum);
	}

}
