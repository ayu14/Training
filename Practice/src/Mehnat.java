
import java.util.*;
import java.lang.*;

public class Mehnat{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		s=s.replaceAll("\\s", "");
		StringBuffer sb = new StringBuffer(s);
		for(int i=1; i<sb.length(); i=i+2) {
			sb.insert(i, ",");
		}
		System.out.println(sb.toString());
	}
		
		
}
