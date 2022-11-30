package basicprograme;

public class MyClass {

	public static void main(String[] args) {
	 int[] a= new int[] {87,99,23,99,65};
	 int big= a[0];
	 int temp=0;
	 
	 for(int i=0;i<a.length;i++) {
		 if(a[i]>big) {
			 big=a[i];
			 temp=i;
		 }
			 
	 }
	 System.out.println(big+" "+temp);

	}

}
