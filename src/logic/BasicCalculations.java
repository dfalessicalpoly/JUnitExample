package logic;

public class BasicCalculations {

	 /*
	  public static void main(String[] args) {
	  	        BasicCalculations A = new BasicCalculations();
	        double Result;
	        Result = A.PerfectSum(1, 2);
	        Result = Result + (int)A.PerfectDivision(2,2);
	        System.out.println("Sum result is " + Result);
	    } 
	*/
	
	public int PerfectSum (int a, int b){
		int result;
			result = a + b;
		return (result);
	}

	public double PerfectDivision (int a, int b){
		double result;
			result = a / b;
		return (result);
	}
}
