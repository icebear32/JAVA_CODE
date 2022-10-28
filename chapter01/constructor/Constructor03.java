public class Constructor03 {
	public static void main(String[] args) {
		Dog d = new Dog();	
		//定义自己的构造器后使用默认的无参构造器，系统会报错
		//除非显式定义 Dog(){}
	}
}

class Dog {
	//如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)
	/**
	 *	默认构造器
	 *	Dog() {
	 *
	 *	} 
 	 *
 	 * */

	//一旦定义了自己的构造器,默认的构造器就覆盖了，
	//就不能再使用默认的无参构造器，除非显式的定义一下
	public Dog(String dName) {
		//...
	}

	Dog() {	//显式的定义一下

	}	
}
