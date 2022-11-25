public class StringMethod01 {
	public static void main(String[] args) {
		//equals比较内容是否相同，区分大小写
		String str1 = "hello";
		String str2 = "Hello";
		System.out.println(str1.equals(str2));

		//equalslgnoreCase //忽略大小写的判断内容是否相等
		String username = "join";
		if ("join".equalsIgnoreCase(username)) {
			System.out.println("Success!");
		} else {
			System.out.println("Failure!");
		}

		//length //获取字符的个数，字符串的长度
		System.out.println("ygh".length());

		//indexOf //获取字符在字符串中第1次出现的索引，索引从0开始，如果找不到，返回-1
		String s1 = "www.baidu.com@qq";
		int index = s1.indexOf('@');
		System.out.println(index);

		//lastIndexOf //获取字符在字符串中最后1次出现的索引，索引从0开始，如找不到，返回-1
		String s2 = "qq@comyy@oo";
		index = s2.indexOf('@');
		System.out.println(index);
		
		//substring //截取指定范围的子串
		String name = "hello,张三";
		System.out.println(name.substring(6));	//从索引6开始截取后面所有的内容
		System.out.println(name.substring(0, 5));	//从索引0开始截取5个字符的内容

	}
}
