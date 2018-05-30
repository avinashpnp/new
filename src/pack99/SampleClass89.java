package pack99;

public class SampleClass89 extends SampleClass99 extends SampleClass79 {
	int a=36;
	int b=63;
	int c=96;
	public void m1() {
		System.out.println(a+b);
	}
	public void m2 () {
		System.out.println(b+c);
	}
	

	public static void main(String[] args) {
	
		SampleClass89 aa=new SampleClass89();
		aa.m1();
		aa.m2();
		SampleClass99 ab=new SampleClass99();
		ab.m1();
		ab.m2();
		SampleClass79 ac=new SampleClass79();
			ac.m1();
		ac.m2();
		
			

	
	}

}
