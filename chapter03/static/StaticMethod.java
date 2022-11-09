public class StaticMethod {
	public static void main(String[] args) {
		//创建两个学生对象，交学费
		Stu tom = new Stu("tom");
		//tom.payFee(100);
		Stu.payFee(100);	//对不对？
		//对，类方法的修饰符是public，可以调用，跟上面的代码一样

		Stu mary = new Stu("mary");
		//mary.payFee(200);
		Stu.payFee(200);	//对不对？
		//对

		//输出当前收到的总学费
		Stu.showFee();	//300
		System.out.println();

		System.out.println(MyTools.calSum(10, 30));
	}
}

//开发自己的工具类，可以将方法做成静态的，方便调用
class MyTools {
	//求出两个数的和
	public static double calSum(double n1, double n2) {
		return n1 + n2;
	}
}

class Stu {
	private String name;	//普通成员
	//定义一个静态变量，来累计学生的学费
	private static double fee = 0;

	public Stu(String name) {
		this.name = name;
	}

	//说明
	//1.当方法使用了static修饰后，该方法就是静态方法
	//2.静态方法就可以访问静态属性/变量
	public static void payFee(double fee) {
		Stu.fee += fee;	//累计
	}

	public static  void showFee() {
		System.out.println("总学费有：" + Stu.fee);
	}
}
