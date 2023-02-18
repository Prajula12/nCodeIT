package programs;


//Write a Java program to sum of first 100 prime numbers

public class SumOfPrime {

	public static void main(String[] args) {
		long sum = 0;
		for (int i=2; i <= 100; i++) {
			int count = 0;
			for (int j=2; j <= i; j++) {
				if (i % j == 0) {
					count += 1;
				}
			}
			if (count <= 1) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
