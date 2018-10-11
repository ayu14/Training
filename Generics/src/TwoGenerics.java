
public class TwoGenerics<T1, T2> {
	private T1 data1;
	private T2 data2;
	
	//public T3 staticVariable;
	
	public void setData1(T1 data) {
		this.data1=data;	
	}
	
	public void setData2(T2 data){
		this.data2=data;
	}
	
	public T1 getData1() {
		return data1;
	}
	
	public T2 getData2() {
		return data2;
	}
	
	public void print(){
		System.out.println("T1 : "+String.valueOf(data1)+" and T2: "+String.valueOf(data2));
	}

	public static <T3> void method(T3 t) {
		System.out.println("T3: "+ String.valueOf(t));
		
	}
	
	public static void main(String[] args) {
		TwoGenerics<Integer, String> generic=new TwoGenerics<>();
		TwoGenerics<String, Integer> generic1=new TwoGenerics<>();
		
		generic.setData1(10);
		generic.setData2("test");
		generic.print();
				
		generic1.setData2(100);
		generic1.setData1("TEST");
		generic1.print();
		
		TwoGenerics.method(10);
	}
}
