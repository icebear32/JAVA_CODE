public class ExceptionExercise01 {
	int x;	//默认0
	public static void main(String[] args) {
		System.out.println("==========================================>");
		try {
			String friends[] = {"tom","jack","milan"};
			for (int i = 0; i < 4; i++) {
				System.out.println(friends[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();	//出现 ArraylndexOutOfBoundsException
		}
		System.out.println("==========================================>");
	
		try {
			Cat cat = new Cat();
			cat = null;
			System.out.println(cat.name);
		} catch (Exception e) {
			e.printStackTrace();	//出现NullPointerException
		}
		System.out.println("==========================================>");
	
		try {
			int y;
			ExceptionExercise01 a = new ExceptionExercise01();
			y = 3 / a.x;	//==> 3 / 0
			System.out.println("program ends ok!");
		} catch (Exception e) {
			e.printStackTrace();	//出现 ArithmeticException
		}
		System.out.println("==========================================>");
	
		try {
			Object obj = new Date();
			ExceptionExercise01 ee;
			ee = (ExceptionExercise01)obj;
			System.out.println(ee);
		} catch (Exception e) {
			e.printStackTrace();	//出现转型错误
		}
		System.out.println("==========================================>");
	
	}
}

class Cat {
	public String name;
}
