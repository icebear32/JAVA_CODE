/*
 * 编写 Test 类，在 main 方法中创建 PC 和 NotePad 对象，
 * 分别给对象中特有的属性赋值，以及从 Computer 类继承的属性赋值，
 * 并使用方法并打印输出信息。
 * */
public class ExtendsExercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PC pc = new PC("intel", 16, 1024, "IBM");
		pc.printInfo();
		
		NotePad note = new NotePad("xiaomi", 8, 500, "break");
		note.printInfo();
	}

}