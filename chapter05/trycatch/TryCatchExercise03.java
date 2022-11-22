public class TryCatchExercise03 {
	public static int method() {
		int i =1;	//i = 1
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
			return ++i;	
			//i = 3 ==> 变成3 后这个return 不会马上执行
			//会保存在一个 临时变量 temp，temp=3
			//因为有 finally，所以这个return 语句不能马上执行
			//temp = 3保存的是当前变量 i 的值
		} finally {	//但是有 finally ，必须执行finally 中的代码
			++i;	
			//到了 finally 程序，i 加加得到的是4
			System.out.println("i = " + i);	//输出的是 i = 4
			//因为 finally 没有 return 语句
			//但是要返回一个语句
			//返回的是 temp  = 3
		}
	}
	
	public static void main(String[] args) {
		System.out.println(method());	
		//所以返回的是 
		//i = 4
		//3
	}
}
