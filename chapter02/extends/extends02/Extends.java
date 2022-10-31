public class Extends {
	public static void main(String[] args) {
		com.ygh.extends02.Pupil pupil = new Pupil();
		pupil.name = "小明";
		pupil.age = 10;	
		pupil.testing();
		pupil.setScore(60);
		pupil.showInfo();

		System.out.println("===== =====");
		com.ygh.extends02.Graduate graduate = new Graduate();
		graduate.name = "大明";
		graduate.age = 22;
		graduate.testing();
		graduate.setScore(100);
		graduate.showInfo();
	}
}

