public class Poly {
	public static void main(String[] args) {
		Master tom = new Master("汤姆");
		Dog dog = new Dog("中华田园犬");
		Bone bone = new Bone("骨头");

		tom.feed(dog, bone);

		System.out.println("===== 0_0 =====");
		Cat cat = new Cat("小花猫");
		Fish fish = new Fish("鱼");

		tom.feed(cat, fish);
	
		System.out.println("===== 0_0 =====");
		//添加 给小猪喂米饭
		Pig pig = new Pig("小花猪");
		Rice rice = new Rice("米饭");
		tom.feed(pig, rice);
	}
}
