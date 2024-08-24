package program.MaximumVaue;

public class FindMaximum <T extends Comparable <T>>{
	 T a , b , c;
	 FindMaximum(T a , T b , T c){
		 this.a = a;
		 this.b = b;
		 this.c = c;
	 }
	 
	 public T testMaximum() {
		return  FindMaximum.maximumNumber(a,b,c);
	 }
	 

	public static <T extends Comparable<T>> T maximumNumber (T a , T b , T	 c) {
		T max = a;
		
		if(b.compareTo(max) > 0) {
			max = b;
		}
		if(c.compareTo(max) > 0) {
			max = c;
		}
	  printMax(a,b,c , max);
	  return max;
	}

	//method to print maximum value
	 public static <T> void printMax(T a , T b , T c, T max) {
		 System.out.printf("Maximum Value among %s , %s, %s is : %s\n" , a, b , c, max);
	 }
	

	public static void main(String[] args) {
		Integer a = 30 , b = 225, c = 500;
		Float af1 = 30.5f, bf2 = 45.5f, cf3 = 20.5f;	
		String as1 = "Ashwini" , bs2 = "AditiJd" , cs3 = "Nivedita";
		
		new FindMaximum(a,b,c).testMaximum();
		new FindMaximum(af1,bf2,cf3).testMaximum();
		new FindMaximum(as1,bs2,cs3).testMaximum();
		
		
	}

}
