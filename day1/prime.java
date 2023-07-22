package week1.day1;

public class prime {
	public static void main(String[] args) {
	    int n = 456;
	    int c = 0;
	    if (n <= 1) {
	      System.out.println("The number is not prime");
	      return;
	    }
	    for (int i = 1; i <= n / 2; i++) {
	      if (n % i == 0) {
	        c++;
	      }
	    }
	    if (c > 1) {
	        System.out.println("The number is not prime");
	    }
	    else {
	      System.out.println("The number is prime");
	    }
	}
}
