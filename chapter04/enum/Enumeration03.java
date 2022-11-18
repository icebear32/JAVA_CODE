public class Enumeration03 {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.AUTUMN);
		System.out.println(Season.WINTER);
	}
}

enum Season {	//类
	//public final static Season SPRING = new Season("春天","温暖");
	//public final static Season WINTER = new Season("冬天","寒冷");
	//public final static Season SUMMER = new Season("夏天","温暖");
	//public final static Season AUTUMN = new Season("秋天","温暖");
	//如果使用了 enum 来实现枚举类
	//1.使用关键字 enum 替代 class
	//2.public final static Season SPRING = new Season("春天","温暖");
	//  直接使用
	//  SPING("春天","温暖");
	//  替代
	//3.如果有多个常量(对象)，使用 , 号间隔即可
	//SPING("春天","温暖");
	//WINTER("冬天","寒冷");
	//SUMMER("夏天","温暖");
	//AUTUMN("秋天","温暖");
	//
	//3.如果有多个常量(对象)，使用 , 号间隔即可
	SPRING("春天","温暖"),WINTER("冬天","寒冷"),SUMMER("夏天","温暖"),AUTUMN("秋天","温暖");
	//
	//4.如果使用 enum 来实现枚举，要求将定义常量对象，写在前面

	private String name;
	private String desc;	//描述

	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public  String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}
	
	@Override
	public String toString() {
		return "Season{" + 
			"name = "  + name + '\'' +
			", desc = " + desc + '\'' + 
			'}';
	}
}
