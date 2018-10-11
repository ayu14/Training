
public class GenericsInheritance<T extends Number> {        //this was done to get properties int long short byte but not String
	//public class GenericsInheritance<T1, T2, T3 extends Generic<T1, T2>>     //T3 is the child class to Generic
	//public class GenericsInheritance<T1, T2, T3> extends Generic<T1, T2>>   //GenericInheritance is child class
	
	private T data;                                         //Number is an abstract class which has all these wrapper classes-Integer, short, long, byte, double,float

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		GenericsInheritance<Integer> generic=new GenericsInheritance<>();
		//GenericsInheritance<String> generic=new GenericsInheritance<>();    // will SHOUT/CRY error :P
	}
	
	

}
