public class ExtendsDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====第一个对象=====");
		Sub sub = new Sub();	//创建子类对象 sub
		//=====第一个对象=====
		//父类 base(String name, int age) 被调用...
		//子类 Sub() 被调用...
		
		System.out.println("=====第二个对象=====");
		Sub sub2 = new Sub("jack");	//创建子类对象 sub2
		//=====第二个对象=====
		//父类 base(String name, int age) 被调用...
		//子类 Sub(String name ) 构造器被调用...
	}

}
