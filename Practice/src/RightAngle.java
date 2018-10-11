import java.util.*;
public class RightAngle {
	public static void main(String[] args)
	{ int count=0;
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
	for(int i=1; i<n/2; i++)
	{
		for(int j=1 ; j<n/2 ; j++)
		{
			if((i+j+(i^2+j^2)^(1/2))==n)
			{
				count++;
			}
				
		}
	}
	System.out.print(count);
	
}
}