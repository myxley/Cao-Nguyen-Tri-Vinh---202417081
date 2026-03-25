import javax.swing.JOptionPane;
public class FirstDegreeEquation {
	public static void main(String[] args){
		String strNum1, strNum2;

		strNum1 = JOptionPane.showInputDialog(null, "Enter a: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, "Enter b: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
	
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		
		if(num1 != 0) {
			double x = -(num2) / num1;
			System.out.println("x = " + x);
		}
		else {
			if(num2 == 0) {
				System.out.println("Vo so Nghiem");
			}
			else {
				System.out.println("Vo Nghiem");
			}
		}
		System.exit(0);
	}
}
