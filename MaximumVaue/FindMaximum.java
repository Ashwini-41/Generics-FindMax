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
	
	public static Float maximumNumber(Float af1, Float bf2, Float cf3) {
	    Float max = af1;
		
		if(bf2.compareTo(max) > 0) {
			max = bf2;
		}
		if(cf3.compareTo(max) > 0) {
			max = cf3;
		}
	  return max;
	
	}
	
	public static String maxinumNumber(String as1, String bs2, String cs3) {
		
         String max = as1;
		
		if(bs2.compareTo(max) > 0) {
			max = bs2;
		}
		if(cs3.compareTo(max) > 0) {
			max = cs3;
		}
	  return max;
	
	}

	public static void main(String[] args) {
		Integer a = 30 , b = 225, c = 500;
		Integer ans1 = maximumNumber(a,b,c);
		System.out.println("Maximum Integer value is : " +ans1);
		
		Float af1 = 30.5f, bf2 = 45.5f, cf3 = 20.5f;
		Float ans2 = maximumNumber(af1,bf2,cf3);
		System.out.println("Maximum Float value is : " +ans2);
		
		String as1 = "Ashwini" , bs2 = "AditiJd" , cs3 = "Nivedita";
		String ans3 = maxinumNumber(as1,bs2,cs3);
		System.out.println("Maximum String value is : " +ans3);
		
	}


}
