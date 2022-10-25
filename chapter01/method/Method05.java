public class Method05 {
	public static void main(String[] args) {
		AA a = new AA();
		if(a.isOdd(1)) {
			System.out.println("是奇数");
		} else {
			System.out.println("是偶数");
		}
	}
}

//判断一个数是技术还是偶数，返回Boolean
class AA {
	//思路
	//方法的返回类型boolean
	//方法的名字isodd
	//方法的形参(int num)
	//方法体,判断
	public boolean isOdd(int num) {
//		if(num % 2 != 0) {
//			return true;
//		} else {
//			return false;
//		}
		
		//简化
		//return num % 2 != 0 ? true : false;
		
		//简化
		return num % 2 != 0;
	}
}
