
public class Recursive {

	public static void main (String[]args) {
		 System.out.println("Number:   "+fib(4));
	}
	static int sum (int n)
    {
	if(n<1) {
		return 0;
	}
      System.out.println("On this call n = " + n);

      if (n==1)
        return 1;

      else {return (n * sum(n-1));}
     
    }
	static int fib(int n)
    {
	if(n<=0) {
		return 0;
	}
      System.out.println("On this call n = " + n);

      if (n==1)
        return 1;

      else {return (fib(n-2) + fib(n-1));}
     
    }
	
}
