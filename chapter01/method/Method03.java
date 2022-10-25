public class Method03 {
	public static void main(String[] args) {
		AA a = new AA();	//错误: 不兼容的类型: int[]无法转换为int
		//int res = a.getSumAndSub(1,4);
		int[] res = a.getSumAndSub(1,4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);
		
		//细节：调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型的参数 		
		byte b1 = 1;
		byte b2 = 2;
		a.getSumAndSub(b1,b2);	//可以，低精度转高精度，byte -> int
		//a.getSumAndSub(1.1,1.8);	//不可以,从double转换到int可能会有损失
		//实参和形参的类型要一直或兼容、个数、顺序必须一致
		//a.getSumAndSub(100);	//个数不一致,原因: 实际参数列表和形式参数列表长度不同		
		a.f4("tom",10);		//可以
		//a.f4(10,"jack");	//不可以，实际参数和形式参数顺序不对，原因: 实际参数列表和形式参数列表长度不同
	}
}

class AA {
	//1.一个方法最多有一个返回值    [如果返回多个结果？>返回数组]
	//2.返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)
	public int[] getSumAndSub(int n1, int n2) {
		int[] resArr = new int[2];	//创建一个数组
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}

	//3.如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值; 
	//而且要求返回值类型必须和return的值类型一致或兼容
	public double f1() {
		double d1 = 1.1 * 3;
		int n = 100;
		return n;	//可以的，兼容性，int 转类型-> double 
	}
//	public int f2() {
//		double d1 = 1.1 * 3;
//		//错误: 不兼容的类型: 从double转换到int可能会有损失
//		return d1;	//不可以，double -> int
//	}
	
	//4.如果方法是 void，则方法体中可以没有 return 语句，或者只写 return;
	public void f3() {
		System.out.println("hello");
		int n = 10;
		return;	//可以写
		//return n;	//不可以写,错误: 不兼容的类型: 意外的返回值
	}

	public void f4(String str,int n) {
		
	}
}
