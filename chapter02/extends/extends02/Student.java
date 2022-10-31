//是父类，是Pupil 和 Graduate 的父类
public class Student {
	public String name;
	public int age;
	private double score;	//成绩

	//共有属性
	public void setScore(double score) {
		this.score = score;
	}

	//公有方法
	public void showInfo() {
		System.out.println("学生名 " + name + " 年龄 " + age + " 成绩 " + score);
	}
}
