public class FinalDetail01 {
	public static void main(String[] args) {
		CC cc = new CC();	//final类不能继承，但是可以实例化对象		
		
		new EE().cal();	//如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承
	}
}

class AA {
	/**
 	 * final 修饰的属性在定义时，必须赋初值，并且以后不能再修改，
 	 * 赋值可以在如下位置之一
 	 * 【选择一个位置赋初值即可】:
 	 *
 	 * 1) 定义时：如 public final double TAX_RATE = 0.08;
 	 * 2) 在构造器中
 	 * 3) 在代码块中
 	 *
 	 */ 
	public final double TAX_RATE1 = 0.08;	//定义时赋值
	public final double TAX_RATE2;	//不赋值会提示报错
	public final double TAX_RATE3;	//不赋值会提示报错
	//
	//但是可以在构造器里面赋值
	public AA() {
		TAX_RATE2 = 1.1;
	}
	//也可以在代码块中赋值
	{
		TAX_RATE3 = 8.8;
	}
}

class BB {
	/**
 	 * 如果final修饰的属性是静态的，则初始化的位置只能是
 	 *
 	 * 1) 定义时
 	 * 2) 在静态代码块
 	 * 3) 不能在构造器中赋值
 	 *
 	 */ 
	public static final double TAX_RATE1 = 99.9;
        public static final double TAX_RATE2;
        
	//public static final double TAX_RATE3;	//提示报错
        //因为静态变量在类加载的时候执行，而构造器是在创建对象时调用，
        //有时还不一定调用，所以会导致 静态属性 TAX_RATE 时没有值的
        //编译器直接报错
	//public BB() {
	//	TAX_RATE3 = 1.1;		
	//}

	static {
		TAX_RATE2 = 3.3;	//可以
	}
}

//final类不能继承，但是可以实例化对象
final class CC {}

//如果类不是final类，但是含有final方法，
//则该方法虽然不能重写，但是可以被继承
//即，仍然遵守继承的机制
class DD {
	public void cal() {
		System.out.println("cal() 方法");
	}
}
class EE extends DD {}
