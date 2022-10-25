public class Method06 {
	public static void main(String[] args) {
		AA a = new AA();
		a.print(5,5,'0');		
	}
}

class AA {
	//根据行、列、字符打印对应行数和列数的字符,
	//比如:行:4,列:4，字符#,则打印相应的效果
	/*
 	*	####
 	*	####
 	*	####
 	*	####
 	*
 	*/
	//方法的返回类型 void
	//方法的名字 print
	//方法的形参(int row, int col, char c)
	//方法体,判断
	public void print(int row, int col, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(c);
			}
			System.out.println();	//换行
		}
	}
}
