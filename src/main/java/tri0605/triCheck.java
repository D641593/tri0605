package tri0605;

public class triCheck {
	public String triangleCheck(double a,double b,double c) throws Exception {
		 if (a < b + c && b < a + c && c < a + b) {
			 if (a == b && b == c) {
				 return "���T����";
			 } else if (abs(pow(a) - (pow(b) + pow(c))) < 0.01
					 || abs(pow(b) - (pow(a) + pow(c))) < 0.01
					 || abs(pow(c) - (pow(a) + pow(b))) < 0.01) {
				 return "�����T����";
			 } else if (a == b || a == c || b == c) {
				 return "���y�T����";
			 } else {
				 return "�T����";
			 }
		 } else {
			 throw new Exception("���O�T����");
			 }
	 }
	 /**
	 * �Ω�������.
	 * @param a input
	 * @return �^��a�������
	 */
	 private double pow(double a) {
		 return a * a;
	 }
	 
	 /**
	 * �Ω�������.
	 * @param a input
	 * @return �^��a�������
	 */
	 private double abs(double a) {
		 if (a < 0) {
			 return a * -1;
		 }
		 return a;
	 }

	 /**
	 * �Ω�T�{�ϥΪ̪�input�O�Ʀr.
	 * @param input ��J
	 * @return
	 */
	 public static boolean digitCheck(String input) {
		 boolean flag = true;
		 for (int i = 0; i < input.length(); i++) {
			 if (!Character.isDigit(input.charAt(i))) {
				 flag = false;
			 }
		 }
		 return flag;
	 }

}
