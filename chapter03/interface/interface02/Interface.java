public class Interface {
	public static void main(String[] args) {
		
	}
}

//1. 如果一个类 implements 实现 接口
//2.需要将接口的所有抽象方法都实现
class A implements AInterface {
	@Override
	public void hi() {
		System.out.println("hi()...");
	}
}
