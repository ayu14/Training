
public interface Stack<T> {                          //static final variables. so we don't mention in interface
	void push(T data);
	T pop();
	boolean isEmpty();
	int size();
}
