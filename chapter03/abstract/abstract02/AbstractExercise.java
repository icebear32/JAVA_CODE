public class AbstractExercise {
	public static void main(String[] args) {
		CommonEmployee c = new CommonEmployee("tom", 123, 7000);
		c.work();

		Manager m = new Manager("jack", 900, 90000);
		m.setBonus(5000);
		m.work();
	}
}
