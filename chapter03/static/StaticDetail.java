public class StaticDetail {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.n1);
		
		//System.out.println(b.n2);	//去掉 static ，报错
		
		//静态变量是类加载的时候，就创建了,所以我们没有创建对象实例
		//也可以通过类名.类变量名来访问	
		System.out.println(C.address);
	}
}

class B {
	public static int n1 = 100;
	//public int n2 = 100;	//去掉 static
}

//类加载过后，会生成一个 class 的实例，这个实例会包含 static 的变量 
class C {
	public static String address = "北京";
}
