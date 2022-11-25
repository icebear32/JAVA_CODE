public class StringMethod02 {
	public static void main(String[] args) {
		//1.toUpperCase 转换成大写
		String s1 = "heLLo";
		System.out.println(s1.toUpperCase());
		//2.toLowerCase
		s1 = "heLLo";
		System.out.println(s1.toLowerCase());

		//3.concat拼接字符串
		s1 = "ygh";
		s1 = s1.concat("asdasj").concat("sjjj");
		System.out.println(s1);

		//4.replace 替换字符串中的字符
		//
		//解读：s1.replace() 方法执行后，返回的结果才是替换过的
		//       注意对s1没有任何影响
		//
		s1  = "sajfid大大大issjakf";
		s1 = s1.replace("大","小");
		System.out.println(s1);

		//5.split 分割字符串，对于某些分割字符，我们需要转义比如 | \\ 等
		String poem = "街禾日当午，汗滴禾下士，谁知盘中餐，粒粒皆辛苦";
		String[] split = poem.split("，");
		System.out.println("==这首诗的内容==");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}

		System.out.println("==分割后的内容==");
		poem = "E:\\aaa\\bbb";
		split = poem.split("\\\\");

		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		System.out.println("==转换成字符数组的内容==");
		//6.toCharArray 转换成字符数组
		String s = "happy";
		char[] chs = s.toCharArray();
		for (int i  = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}

		//7.compareTo 比较两个字符串的大小,如果前者大,则返回正数,
		//   后者大,则返回负数，如果相等，返回0
		//
		//(1) 如果长度相同，并且每个字符也相同,就返回0
		//(2) 如果长度相同或者不相同，但是在进行比较时，可以区分大小
		//	就返回	if (c1 != c2) {
		//			return c1 - c2;
		//		}
		//(3) 如果前面的部分都相同，就返回str1.len - str2.len
		//
		String a  ="jackabc";
		String b = "jack";
		System.out.println(a.compareTo(b));	//返回值是 3

		//8.format 格式字符串
		/**
		 *	占位符有:
		 *		%s 字符串 %c 字符 %d 整型 %.2f 浮点型
		 *	
		 *	1。%s , %d ,%.2f %c称为占位符
		 *	2。这些占位符由后面变量来替换
		 *	3。%s 表示后面由字符串来替换
		 *	4。%d 是整数来替换
		 *	5。%.2F表示使用小数来替换，替换后，只会保留小数点两位
		 *	6。%c 使用char类型来替换
		 *
		 *
		 **/
		String name = "jack";
		int age = 10;
		double score = 98.3 /3;
		char gender = '男';
		String info1 = "姓名：" + name + " 年龄：" + age + " 成绩：" + score + " 性别："  + gender;
		System.out.println(info1);
		String info2 = String.format("姓名：%s 年龄：%d 成绩：%.2f 性别：%c",name,age,score,gender);
		System.out.println(info2);
	}
}
