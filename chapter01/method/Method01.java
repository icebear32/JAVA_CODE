public class Method01 {
	public static void main(String[] args) {
		//方法使用
		//方法写好，如果不调用就不会输出
		//先创建对象，然后调用方法即可
		Person p1 = new Person();
		p1.speak();
		p1.cal01();	
		p1.cal02(5);	//1加到5
		p1.cal02(10);	//1加到10

		int returnRes = p1.getSum(10,20);	//调用getSum 方法，同时 num1 = 10，num2 = 20
		System.out.println("getSum方法返回的是：" + returnRes);
	}
}

class Person {
	String name;
	int age;

	//方法（成员方法）
	//添加 speak 成员方法
	//public 表示方法是公开的
	//void 表示方法没有返回值
	//speak() speak是方法名，()形参列表
	//{ } 方法体，可以写我们要执行的代码
	public void speak() {
		System.out.println("我是一个好人");
	}

	//添加cal01 成员方法，可以计算从 1 + ... + 1000 的结果
	public void cal01() {
		//循环
		int res = 0;
		for(int i = 1; i <= 1000; i++){
			res += i;
		}
		System.out.println("计算结果 = " + res);
	}

	//添加cal02 成员方法，该方法可以接收一个数 n，计算从 1... + n 的结果
	//(int n) 形参列表，表示当前有一个形参 n，可以接受用户输入
	public void cal02(int n){
		int res = 0;
		for(int i = 1;i <= n;i++){
			res += i;
		}
		System.out.println("计算结果 = " + res);
	}
 	
	//添加getSum 成员方法，可以计算两个数的和
	//int 表示方法执行后，返回一个 int 值
	//形参列表，可以写多个，接受用户传入的数
	//return res; 表示把 res 的值，返回
	public int getSum(int num1,int num2){
		int res = num1 + num2;
		return res;
	}
}
