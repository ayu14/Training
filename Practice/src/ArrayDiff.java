import java.util.Scanner;
import java.lang.*;

public class ArrayDiff {
	public static void main(String[] args)
	{ Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int []a= new int[n];
	for(int i=0; i<a.length; i++) {
		a[i]=sc.nextInt();
	
	}
	 for(int i=0; i<a.length-1;i++)
	 { for(int j=i+1;j<a.length;j++)
		 {if(prime(a[i])&& prime(a[j]))
			 {
			 System.out.println(a[i]+" "+a[j]);
			 }
		 }
	 }
	}
  
	
	public static boolean prime (int a){
		
	int i;
	boolean temp=false;
	for (i=2; i<(a^(1/2)); i++)
	{
		if(a%i==0)
			temp=false;
		else
			temp=true;
	
	}
	return temp;
	}


	
}
