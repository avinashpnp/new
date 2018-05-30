package pack1;

public class Class2 {
	int d=6;
	int e=5;
  	int f=4;
	 
  	public void m4() {
  		System.out.println(d+e);
  	}
	
  	public void m5() {
  		System.out.println(e+f);
  	}
  	public void m6() {
  		System.out.println(f+d);
  	}
	
  	public static void main(String[] args) {
Class2 a= new Class2();
a.m4();
a.m5();
a.m6();
Class1 aa= new Class1();
aa.m1();
aa.m2();
aa.m3();



	}

}         
