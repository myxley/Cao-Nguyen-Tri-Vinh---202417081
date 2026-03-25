package goi;

public class hinhtron {
	private int R;
	private double C;
	private double S;
	
	public void getR (int a) {
		R = a;
	}
	
	public double setC() {
		C = 2 * R * 3.14;
		return C;
	}
	
	public double setS() {
		S = R * R * 3.14;
		return S;
	}
}
