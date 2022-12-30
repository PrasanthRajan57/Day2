package week1.day2;

public class Isprime {
	public static void main(String[] args) {
	int n=50;
		for (int i=2;i<=n-1;i++) {
		
			if (n%i==0)
			{

				System.out.println(n+"is a prime number");

				break;
			
			}
		
			else
			{
				System.out.println(n+"is not a prime number");
			}
		
			
		}
	}

}
