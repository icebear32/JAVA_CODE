public class VarParameter03 {
	public static void main(String[] args) {
		Method m = new Method();
		System.out.println(m.showScore("milan", 90.1, 80.0));	
		System.out.println(m.showScore("terry", 90.1, 80.0, 10, 30.5, 70));	
	}
}

class Method {
	/*
 	* 有三个方法，
 	* 分别实现返回姓名和两门课成绩(总分)，
 	* 返回姓名和三门课成绩(总分)，
 	* 返回姓名和五门课成绩(总分)。
 	* 封装成一个可变参数的方法。
 	* */
	public String showScore(String name, double... scores) {
		double totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}
		return name + " 有 " + scores.length + "门课的成绩总分为=" + totalScore; 
	}
}
