public class PolyObject {
	public static void main(String[] args) {
		//体验对象多态特点
		Animal animal = new Dog();	//animal 编译类型时Animal，运行类型时 Dog
		
		animal.cry();	//小狗汪汪叫
		//运行时，执行该行时，animal运行类型时Dog，所以 cry 就是 Dog 的 cry

		//animal 运行类型变成了 Cat，编译类型仍然时 Animal
		animal = new Cat();
		animal.cry();	//小猫喵喵叫
	}	
}
