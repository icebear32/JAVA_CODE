public class Final01 {
	public static void main(String[] args) {
		E e = new E();
		//e.TAX_RATE = 0.09;	//未加 final 修饰，可以更改属性值
		//e.TAX_RATE = 0.09;	//加 final 修饰后，不可以更改属性值，提示报错		
	}
}

//class A {}
//class B extends A {}
//
//如果要求 A 类不能被其他类继承
final class A {}

//class B extends B {}	//提示报错


//class C {
//	public void h1() {}
//}
//class D extends C {
//	@Override
//	public void h1() {
//		System.out.println("重写了 C类的 hi 方法");
//	}
//}
//
class C {
	//如果要求 hi 方法不能被子类重写
	//可以使用 final 修饰 hi 方法
	public final void h1() {}
}
class D extends C {
	//出现提示报错
	//@Override
	//public void h1() {
	//	System.out.println("重写了 C类的 hi 方法");
	//}
}

//当不希望类的的某个属性的值被修改，可以用final修饰
class E {
	public final double TAX_RATE = 0.08;
}

//当不希望某个局部变量被修改，可以使用final修饰
class F {
	public void cry() {
		//这时 NUM 也被称为 局部常量
		final double NUM = 0.01;
		//NUM = 0.9;	//加 final 修饰后提示报错
		System.out.println("NUM=" + NUM);
	}
}	
