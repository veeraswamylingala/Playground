import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int n_first=n/10;
      int n_second=n%10;
      int sum=n_first + n_second;
      System.out.println(sum);
      
      
	}
}