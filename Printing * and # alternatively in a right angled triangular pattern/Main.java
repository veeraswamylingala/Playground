import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n=in.nextInt();
      int temp=0;
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=row;col++)
        {
          if(temp==0)
          {
          System.out.print("*");
          temp=1;
          }
        else
        {
          System.out.print("#");
      temp=0;
        }
        }
        System.out.print("\n");
        
      
    }
}
}