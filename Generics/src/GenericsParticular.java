
public class GenericsParticular {

		private Integer data;
		
		
	public void setData(Integer data) {
		this.data=data;	
	}

	public Integer getData() {
		return data;
	}
		
	public <T> void print(T value) {                    //when only a method calls generic, the declaration is before method.. in class later
		System.out.println(String.valueOf(value));      // if we put object or something, valueOf will take care of what to print
	}
	
	public <T> T printReturn(T value) {
		return value;
	}

	public static void main(String[] args) {
		//Generic takes wrapper classes and not primitive types cuz it's defined only for objects.
		
		GenericsParticular generic=new GenericsParticular();
		
		generic.print(new Integer(10));    // either we create an object
		generic.print(10);                 //or compiler in java implicitly converts it.
		
		generic.print("test");
		generic.print(new String("test"));
		
		System.out.println(generic.printReturn(new Integer(100))+" and is of class- "+ generic.printReturn(100).getClass());  //shows the wrapper class called
	

	}
}
