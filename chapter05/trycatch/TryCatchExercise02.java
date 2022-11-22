public class TryCatchExercise02 {
	public static int method() {
		int i = 1;
		try {
			i++;	//i = 2
			String[] names = new String[3];	//String 数组
			if (names[1].equals("tom")) {	//Null Pointer Exception
				System.out.println(names[1]);
			} else {
				names[3] = "ygh";
			}
			return 1;
		} catch (ArrayIndexOutOfBoundsException e) {
				return 2;
		} catch (NullPointerException e) {	//捕获，应该返回该程序内容
			return ++i;	//i = 3
		} finally {	//但是有 finally ，必须执行finally 中的代码
			return ++i;	//i = 4
		}
	}
	
	public static void main(String[] args) {
		System.out.println(method());	//所以返回的是 4
	}
}
