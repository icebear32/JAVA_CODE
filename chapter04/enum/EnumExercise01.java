public class EnumExercise01 {
	public static void main(String[] args) {
		Gender boy1 = Gender.BOY;	//可以
		Gender boy2 = Gender.BOY;	//可以
		System.out.println(boy);	//输出BOY //本质就是调用 Gender2的父类Enum的 toString

		System.out.println(boy2 == boy);	//true		
	}
}

enum Gender {	//父类 Enum 的 toString
	BOY,GIRL;
}
