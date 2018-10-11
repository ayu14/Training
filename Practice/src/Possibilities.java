import java.util.Scanner;

public class Possibilities {
	public static void main(String[] args) {
		int n, k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter prod");
		k=sc.nextInt();
		multiply(arr, k);
		
	}
	
	public static void multiply(int a[], int k) {
		int ayu, c=0;
		for(int i=0; i<a.length; i++) {
			ayu=a[i];
			for(int j=i+1; j<a.length; j++) {
				if(ayu<k) {
					c++;
					ayu=ayu*a[j];
				}
				}
			}
		if(a[a.length-1]<k)c++;
			
		System.out.print(c);
	}
}

