public class FinalExercise02 {
	public static void main(String[] args) {
		
	}
}

class Something {	//下面代码是否有误？为什么？
	public int addOne(final int x) {	//可以
		++x;	//错误，不能修改 final x 的值
		return x + 1;	//可以，返回新的值，x 不会有新的变化
	}
}
