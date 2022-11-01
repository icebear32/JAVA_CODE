public class Sub extends Base {	//子类
	public Sub() {	//构造器
		System.out.println("Sub()...");
	}
	
	public void sayOk() {
		//非私有的属性和方法可以在子类直接访问
		//但是私有属性不能在子类直接访问
		System.out.println(n1 + " " + n2 + " " + n3 /*+ " " + n4*/);	//使用 n4 会报错
		test100();
		test200();
		test300();
		//test400();	//使用 test400 报错
		
		//要通过公共的方法去访问
		System.out.println("n4 = " + getN4());
		callTest400();	//通过callTest400 调用 test400 方法
	}
}
