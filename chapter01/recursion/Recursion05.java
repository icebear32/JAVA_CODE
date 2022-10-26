public class Recursion05 {
	public static void main(String[] args) { 
		T t1 = new T();
		int day = 1;
		int peachNum = t1.peach(day);
		if (peachNum != -1) {
			System.out.println("第1天有"+  peachNum + "个桃子");
		}
	}
}

class T {
	//猴子吃桃问题
	//规律就是 前一天的桃子 = (后一天的桃子 + 1) * 2
	public int peach(int day) {
		if (day == 10) {	//第十天只有一个套
			return 1;
		} else if (day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.println("day在 1 - 10");
			return -1;
		}
	}
}
