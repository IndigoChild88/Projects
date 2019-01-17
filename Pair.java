
public class Pair<T, U> {
	// attributes
	private T first;
	private U second;
	
	// constructors
	public Pair() {
		first = null;
		second = null;
	}
	public Pair(T first_in, U second_in) {
		first= first_in;
		second= second_in;
		
	}
	public String toString() {
		return "First: "+ first +", Second: "+second;
	}

}
