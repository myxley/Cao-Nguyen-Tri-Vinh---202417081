package a.b.c;

public class X {
	public int a1;
	int a2;
	private int a3;
	
	public void m1() {}
	void m2() {}
	private void m3() {}
	
	void test() {
		X x = new X();
		x.a1 = 5;
		x.a2 = 5;
		x.a3 = 5;
		
		x.m1();
		x.m2();
		x.m3();
	}
}