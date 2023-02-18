package programs;
import java.util.*;

//Write a Java program to count the number of even and odd elements in a given array

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		int even = 0;
		int odd = 0;
		for (int i=0; i<num; i++) {
			int n = arr[i];
			if (n % 2 == 0) {
				even += 1;
			}else {
				odd += 1;
			}
		}
		System.out.println("Number of Even elements : "+even);
		System.out.println("Number of Odd elements : "+odd);
		sc.close();
	}

}
