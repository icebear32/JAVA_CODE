public class This03 {
	public static void main(String[] args) {	
		System.out.println("f2()方法 去调用本类的 f1() 方法");	
		T t1 = new T();
		t1.f2();	
		
		System.out.println("构造器 去访问另一个构造器");	
		T t2 = new T();
						
		System.out.println("访问属性");	
		T t3 = new T();
		t3.f3();
	}
}

class T {
	
	String name = "tom";
	int age = 10;

	/**
 	* 访问构造器语法：this(参数列表); 
 	* 注意只能在构造器中使用this
 	* （即只能在构造器中访问另外一个构造器）
 	*
 	* 注意：访问构造器语法：this(参数列表); 必须放置第一条语句
 	*
 	* */
	public T() {
		//这里去访问 T(String name, int age)
		this("jack", 100);
		
		System.out.println("T() 构造器");	
	}

	public T(String name, int age) {
		System.out.println("T(String name, int age) 构造器");	
	}

	//访问成员方法的语法：this.方法名(参数列表)；
	public void f1() {
		System.out.println("f1() 方法...");	
	}

	public void f2() {
		System.out.println("f2() 方法...");
		//调用本类的 f1
		//第一种方式
		f1();
		//第二种方式
		this.f1();
	}
	
	public void f3() {
		//使用传统方式访问属性
		System.out.println("name = " + name + " age = " + age);	
		//使用this访问属性
		System.out.println("name = " + this.name + " age = " + this.age);	
	}
}
