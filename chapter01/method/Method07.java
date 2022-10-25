public class Method07 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//创建AA对象 obj
		AA obj = new AA();
		obj.swap(a,b);	//调用swap方法
		System.out.println();
		System.out.println("main方法 a=" + a + " b=" + b);		
	}
}

class AA {
	public void swap(int a,int b) {
		System.out.println("\na和b交换前的值\na=" +  a + "\tb=" +b);
		//完成 a 和 b 的交换
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na和b交换后的值\na=" + a + "\tb=" + b);
	}
}
