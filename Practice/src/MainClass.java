import java.util.Scanner;

public class MainClass {
public static void permutation(int a, int b, String s) {
		if(a==b)
			System.out.println(s);
		else {
			swap(s, a, b);
			permutation(a+1, b, s);
		}
		
		
	}
	
public static void swap(String s, int i, int j) {
		char temp;
		char[] cs=s.toCharArray();
						temp=cs[i];
		  				cs[i]=cs[j];
		  				cs[j]=temp;
		}
			
			
       
public static void main(String[] args) {
    	   
    	Scanner sc = new Scanner(System.in);
   		String s= sc.next();
   		
   		permutation(0, s.length()-1, s);
   				
   			}
}
  