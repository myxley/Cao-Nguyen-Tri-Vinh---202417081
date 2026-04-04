import javax.swing.JOptionPane;
public class SecondFDegreeEquation {
	public static void main(String[] args) {
		String strNum1, strNum2, strNum3;

		strNum1 = JOptionPane.showInputDialog(null, "Enter a: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Enter b: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		strNum3 = JOptionPane.showInputDialog(null, "Enter c: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
	
		double a = Double.parseDouble(strNum1);
		double b = Double.parseDouble(strNum2);
		double c = Double.parseDouble(strNum3);
		
		System.out.println(a + "x^2 + " + b + "x + " + c +"= 0");
		
		if(a == 0) {
			System.out.println("x = " + -c/b);
		}
		else {
			double d = b * b - 4 * a * c;
			double sqr = Math.sqrt(d);
			
			if(d == 0) {
				System.out.println("Phuong trinh co nghiem kep x = " + (-b/(2 * a)));
			}
			else if (d > 0) {
				System.out.println("Phuong trinh co hai nghiem:");
				System.out.println("x1 = " + (-b + sqr) / 2 * a);
				System.out.println("x2 = " + (-b - sqr) / 2 * a);
			}
			else {
				System.out.println("Phuong trinh vo nghiem:");
			}
		}
	
		System.exit(0);
	}

}
