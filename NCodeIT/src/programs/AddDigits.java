package programs;
import java.util.*;
 
// Write a Java program to add all the digits of a given positive integer

public class AddDigits {
    public static long addAllDigits(int num) {
    	long sum = 0;
    	while (num != 0 ) {
    		sum += num % 10;
    		num = num / 10;
    	}
    	return sum;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long add = addAllDigits(num);

		if (add > 0) {
			System.out.println("Add all digits : "+add);
		}else {
			System.out.println("Negative digit");
	    }
		sc.close();
	}

}
