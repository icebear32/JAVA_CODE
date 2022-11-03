public class D extends C {
	public int n1 = 888;
	
	public void cal() {
		System.out.println("D 类的 cal() 方法...");
	}
	
	public void sum() {
		System.out.println("D 类的 sum() 方法...");
		//希望调用父类 A 的 cal 方法
		
		//第一种方法
		//找cal方法时，顺序是，
		//先找本类，如果有，则调用,
		//如果没有，则找父类(如果有，并可以调用，则调用)
		//如果父类没有，则继续找父类的父类，整个规则，就是一样的，直接 Object 类
		//提示:	如果查找方法的过程中，找到了，但是不能访问，则报错
		//		如果查找方法的过程中，没有找到，则提示方法不存在
		//cal();	//输出 ：C 类的 cal() 方法...
		
		//当本类定义相同的方法名时，cal(); 调用的是本类的cal() 方法
		cal();	//D 类的 cal() 方法...
		
		//第二种方法
		//this.cal();//等价 cal();	
		//输出 ：D 类的 cal() 方法...
		
		//当本类定义相同的方法名时，this.cal(); 调用的是本类的cal() 方法
		this.cal();	//输出 ：C 类的 cal() 方法...
		
		//第三种方法
		//找cal() 方法 (super.cal();)的顺序是直接查找父类属性，其他的规则一样
		super.cal();
		
		// n1 和 this.n1 查找的规则是
		//(1)先找本类，如果有，则调用
		//(2)如果没有，则找父类(如果有，并可以调用，则调用)
		//(3)如果父类没有，则继续找父类的父类，整个规则，就是一样的，直接 Object 类
		//提示:	如果查找方法的过程中，找到了，但是不能访问，则报错
		//		如果查找方法的过程中，没有找到，则提示方法不存在
		System.out.println(n1);	//888
		System.out.println(this.n1);	//888
		
		//找n1 (super.n1)的顺序是直接查找父类属性，其他的规则一样
		System.out.println(super.n1);	//100

	}
}