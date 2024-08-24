package program.MaximumVaue;

public class FindMaximum {
	
	public static Integer maximumNumber(Integer a , Integer b , Integer c) {
		Integer max = a;
//		if(a>b && a > c) {
//			max =a;
//		}else if(b > a && b > c) {
//			max = b;
//		}else {
//			max = c;
//		}
//		
		if(b.compareTo(max) > 0) {
			max = b;
		}else if(c.compareTo(max) > 0) {
			max = c;
		}
	  return max;
	}

	public static void main(String[] args) {
		Integer a = 10 , b = 50, c = 112;
		Integer ans = maximumNumber(a,b,c);
		System.out.println("Maximum number is : " +ans);
	}

}
