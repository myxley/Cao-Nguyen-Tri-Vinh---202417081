import javax.swing.JOptionPane;
public class LinearSystem {
	public static void main(String[] args) {
		String stra11, stra12, stra21, stra22, strb1, strb2;

		stra11 = JOptionPane.showInputDialog(null, "Enter a11: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		stra12 = JOptionPane.showInputDialog(null, "Enter a12: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		strb1 = JOptionPane.showInputDialog(null, "Enter b1: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		stra21 = JOptionPane.showInputDialog(null, "Enter a21: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		stra22 = JOptionPane.showInputDialog(null, "Enter a22: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		strb2 = JOptionPane.showInputDialog(null, "Enter b2: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		
		double a11 = Double.parseDouble(stra11);
		double a12 = Double.parseDouble(stra12);
		double a21 = Double.parseDouble(stra21);
		double a22 = Double.parseDouble(stra22);
		double b1 = Double.parseDouble(strb1);
		double b2 = Double.parseDouble(strb2);
		
		double D = a11 * a22 - a12 * a21;
		double D1 = b1 * a22 - b2 * a12;
		double D2 = a11 * b2 - a21 * b1;
		
		System.out.println(stra11 + "x1 + " + stra12 + "x2 = " + strb1);
		System.out.println(stra21 + "x1 + " + stra22 + "x2 = " + strb2);
		
		if(D != 0) {
			double x1 = D1 / D;
			double x2 = D2 / D;
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		else {
			if(D1 == 0 && D2 == 0) {
				System.out.println("Vo so nghiem");
			}
			else {
				System.out.println("Vo nghiem");
			}
		}
		System.exit(0);
	}
}
