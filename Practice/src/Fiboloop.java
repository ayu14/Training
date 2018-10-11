import java.util.Scanner;

public class Fiboloop {
  public static void main(String[] args) {
	  int n, sum=0, a=1 ;
	  Scanner sc=new Scanner(System.in);
	  n=sc.nextInt();
	  
	  for(int i=1; i<=n; i++) {
		  int temp=0;
			  
			  temp=sum;
			  sum=sum+a;
			  a=temp;
			  System.out.print(sum+ " ");
		 
	  }
	   }
}
