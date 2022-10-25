public class Method08 {
	public static void main(String[] args) {
		//测试
		B b = new B();
		int[] arr = {1,2,3};
		b.test100(arr);	//调用方法
		System.out.println("main 的 arr 数组");
		//遍历数组
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
		}
		System.out.println();
	}
}

class B {
	//B类可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化
	public void test100(int[] arr) {
		arr[0] = 200;	//修改元素
		//遍历数组
		System.out.println("test100 的 arr 数组");
		for(int i = 0; i< arr.length; i++){
			System.out.println(arr[i] + "\t");
		}
	}
}
