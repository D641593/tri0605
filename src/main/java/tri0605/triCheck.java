package tri0605;

public class triCheck {
	public String triangleCheck(double a,double b,double c) throws Exception {
		 if (a < b + c && b < a + c && c < a + b) {
			 if (a == b && b == c) {
				 return "正三角形";
			 } else if (abs(pow(a) - (pow(b) + pow(c))) < 0.01
					 || abs(pow(b) - (pow(a) + pow(c))) < 0.01
					 || abs(pow(c) - (pow(a) + pow(b))) < 0.01) {
				 return "直角三角形";
			 } else if (a == b || a == c || b == c) {
				 return "等腰三角形";
			 } else {
				 return "三角形";
			 }
		 } else {
			 throw new Exception("不是三角形");
			 }
	 }
	 /**
	 * 用於取平方值.
	 * @param a input
	 * @return 回傳a的平方值
	 */
	 private double pow(double a) {
		 return a * a;
	 }
	 
	 /**
	 * 用於取絕對值.
	 * @param a input
	 * @return 回傳a的絕對值
	 */
	 private double abs(double a) {
		 if (a < 0) {
			 return a * -1;
		 }
		 return a;
	 }

	 /**
	 * 用於確認使用者的input是數字.
	 * @param input 輸入
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
