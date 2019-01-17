/**
* CS 111 Section 003
* Lab Assignment 12 
* Albert Nunez **/
public class GeometricSeries {
	private static int sum=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long startTime = System.currentTimeMillis();
	
	System.out.println(calculateGeometricSeriesIterative(1,5,3));
	long endTime = System.currentTimeMillis(); 
	System.out.println("*Iteratively it took: "+ (endTime-startTime)+" milli seconds \n");
	
	long startTime1 = System.currentTimeMillis(); 
	System.out.println(calculateGeometricSeriesRecursive(1,5,3));
	long endTime1 = System.currentTimeMillis(); 
	System.out.println("*Recursively it took: "+ (endTime1-startTime1)+" milli seconds ");
	
	 startTime = System.currentTimeMillis();
	
	System.out.println(calculateGeometricSeriesIterative(1,5,3));
	 endTime = System.currentTimeMillis(); 
	System.out.println("*Iteratively it took: "+ (endTime-startTime)+" milli seconds \n");
	
	 startTime1 = System.currentTimeMillis(); 
	System.out.println(calculateGeometricSeriesRecursive(1,5,3));
	 endTime1 = System.currentTimeMillis(); 
	System.out.println("*Recursively it took: "+ (endTime1-startTime1)+" milli seconds ");
	}
	// calculates the geametric series using loops
	public static double calculateGeometricSeriesIterative(double a, double r, int n) {
		double itsum=0;
		for (int i=0; i<n+1;i++) {
			itsum+=(a*(Math.pow(r, i)));
			//n--;
		}
		return itsum;
	}
	// calculates series recursively
	public static double calculateGeometricSeriesRecursive(double a, double r, int n) {
		sum+=a*(Math.pow(r, n));
		if (n>=0) {
			 calculateGeometricSeriesRecursive(a,r,n-1);
		}
		return sum;
	}
}
