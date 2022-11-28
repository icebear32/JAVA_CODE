public class StringBufferMethod {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello");

		//增
		s.append(",");
		s.append("张三丰");
		s.append("赵敏").append(100).append(true).append(10.5);
		System.out.println(s);

		//删
		//  删除索引为 >=start && <end 处的字符
		//  删除 11-14的字符，不包含14的 [11, 14)
		s.delete(11,14);
		System.out.println(s);

		//改
		//  使用 周芷若 替换 索引 9-11 的字符，不包含11，[9,11)
		s.replace(9, 11, "周芷若");
		System.out.println(s);

		//查找指定的子串在字符串第一次出现的索引，如果找不到返回 -1
		int indexOf = s.indexOf("张三丰");
		System.out.println(indexOf);

		//插入
		//在索引为 9 的位置插入 “赵敏”，原来的索引为 9 的内容自动后移
		s.insert(9, "赵敏");
		System.out.println(s);
		
		//长度
		System.out.println(s.length());
		System.out.println(s);
	}
}
