package program.MaximumVaue;

public class FindMaximum {
	
	public static Integer maximumNumber(Integer a , Integer b , Integer c) {
		Integer max = a;
		
		if(b.compareTo(max) > 0) {
			max = b;
		}
		if(c.compareTo(max) > 0) {
			max = c;
		}
	  return max;
	}

	public static void main(String[] args) {
		Integer a = 30 , b = 225, c = 500;
		Integer ans = maximumNumber(a,b,c);
		System.out.println("Maximum number is : " +ans);
	}

}
