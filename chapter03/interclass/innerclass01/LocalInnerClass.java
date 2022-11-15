/**
 * 演示局部内部类的使用
 * */
public class LocalInnerClass {	//外部其他类
	public static void main(String[] args) {	
		Outer02 outer02 = new Outer02();
		outer02.m1();	
		//代码运行流程：
		//创建outer02 对象，调用 Outer02类的 m1 方法
		//
		//进入 Outer02 类
		//进入 m1 方法
		//定义好内部类
		//代码进行到最后 Outer02 类 在创建 Inner02 对象，并调用 f1 方法
		//因此回到 内部类 Inner02 的 f1 方法
		//打印输出语句 和 调用 Outer02 的 m1方法
		//Outer02 方法打印输出语句
		//最后流程结束
		
		//7.外部其他类 --- 不能访问 -----> 局部内部类
		//（因为局部内部类地位是一个局部变量）
		//Inner02 inner02 = new Inner02();	//报错，不能创建

		//查看创建的对象 outer02 的 hash 地址
		//证明是跟 内部类 的 Outer02.this 一样地址
		//说明 outer02 对象调用 m1 ，Outer02.this 就是 outer02 对象
		System.out.println("outer02 hashcode = " + outer02);
	}
}

class Outer02 {	//外部类
	private int n1 = 100;	//私有属性
	
	private void m2() {	//私有方法
		System.out.println("Outer02 m2()");
	}
	
	public void m1() {	//方法
		//1.局部内部类是定义在外部类的局部位置，通常在方法中
		class Inner02 {	//局部内部类(本质还是一个类)
			//2.可以直接访问外部类的所有成员，包含私有的
			public void f1() {
				System.out.println("n1 = " + n1);	//调用 外部类 私有属性
				m2();	//调用 外部类 私有方法
			}
		}
			
		//3.能添加访问修饰符，但是可以使用 final 修饰
		//public class Inner03 {}	//报错
		final class Inner03 {}	//没报错

		class Inner04 extends Inner02 {}	//可以继承
		//class Inner05 extends Inner03 {}	//加上final，不可以继承，继承会报错
		
		//4.作用域：仅仅在定义它的方法或代码块中
		
		class Inner05 {
			public void f2() {
				//5.局部内部类 --- 访问 ----> 外部类的成员 [ 访问方式：直接访问 ]
				//比如 下面 外部类 属性  n1 和 m2()方法
				System.out.println("n1= " + n1);
				m2();
			}
		}
		//6.外部类在方法中，可以创建 Inner02 对象，然后调用方法即可
		Inner02 inner02 = new Inner02();
		inner02.f1();

		//8.如果外部类和局部内部类的成员重名时，
		//默认遵循就近原则，
		//如果想访问外部类的成员，
		//则可以使用（**外部类名.this.成员**）去访问
		class Inner06 {
			private int n1 = 800;
			public void f3() {
				System.out.println("内部类 n1 = " + n1 + " 外部类 n1 = " + Outer02.this.n1);
				//Outer02.this 本质就是外部类的对象，那个对象调用了 m1，Outer02.this 就是哪个对象
				//使用 hashcode 查看 Outer.this 的地址
				System.out.println("Outer02.this hashcode = " + Outer02.this);
			}
		}
		Inner06 inner06 = new Inner06();
		inner06.f3();
	}	
}
