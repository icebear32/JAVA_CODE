public class Enumeration02 {
	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.AUTUMN);
		System.out.println(Season.WINTER);
	}
}

class Season {	//类
	private String name;
	private String desc;	//描述

	//3.在 Season 内部，直接创建固定的对象
	//  定义十个对象
	//
	//4.优化，可以加入 final 修饰符
	public final static Season SPRING = new Season("春天","温暖");
	public final static Season WINTER = new Season("冬天","寒冷");
	public final static Season SUMMER = new Season("夏天","温暖");
	public final static Season AUTUMN = new Season("秋天","温暖");

	//构造器
	//1.将构造器私有化，目的防止 直接 new
	//public Season(String name, String desc) {
	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	//2.去掉 setXxx 方法，防止属性被修改
	public  String getName() {
		return name;
	}

	//public void setName(String name) {
	//	this.name = name;
	//}

	public String getDesc() {
		return desc;
	}

	//public void setDesc() {
	//	this.desc = desc;
	//}
	
	@Override
	public String toString() {
		return "Season{" + 
			"name = "  + name + '\'' +
			", desc = " + desc + '\'' + 
			'}';
	}
}
