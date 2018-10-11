
public class FordStack<T> implements Stack<T> {                  //child should know the signature of parent
	private T[] data=(T[])new Object[5];
	private  int count=0;                                        //not be static, cuz count=0 for each instance created
	
	@Override
	public void push(T data) {
		// TODO Auto-generated method stub
		this.data[count++]=data;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return data[--count];                                  //reduces count. then outputs count.
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}
	
	public static void main(String[] args) {
		FordStack<Integer>fs= new FordStack<>();
		Stack<Number>s=new FordStack<>();                    //left side should generally be parent.so that we can access it
		s.push(new Integer(10));                             //Number can also be used. reference can be anything
		s.push(20);
		s.push(30);
		System.out.println("size of stack is "+ s.size());
		System.out.println(s.pop());
		
		
		
	}

}
