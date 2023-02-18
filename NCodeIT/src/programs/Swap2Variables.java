package programs;
import java.util.*;

//Write a Java program to swap two variables

public class Swap2Variables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println("Before Swap : "+a+" "+b);
		String temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap : "+a+" "+b);
		sc.close();
	}

}
