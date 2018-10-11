import java.util.*;

public class Generics<T> {
	private T data;
	
	
public void setData(T data) {
	this.data=data;	
}

public T getData() {
	return data;
}
	
public <T> T print(T value){
    return value;
}



public static void main(String[] args) {
	//Generic takes wrapper classes and not primitive types cuz it's defined only for objects.
	
	Generics generic=new Generics();
	Generics<Integer> genInt=new Generics<>();     //only allows a particular type. here Integer	
	
	generic.setData(10);
	genInt.setData(45);
	System.out.println(generic.getData());
	System.out.println(genInt.getData());
	System.out.println(generic.getData()+ " is an instance of type "+generic.getData().getClass());   //gives the type of generics. here Integer
	
	generic.setData("Test");
	System.out.println(generic.getData());
	//genInt.setData("Test");                      // will show error
	System.out.println(generic.getData()+ " is an instance of type "+generic.getData().getClass());
}

}
