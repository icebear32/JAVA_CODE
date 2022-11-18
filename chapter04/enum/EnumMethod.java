public class EnumMethod {
	public static void main(String[] args) {
		//使用 Season 枚举类
		Season autumn = Season.AUTUMN;
		//输出枚举对象的名字
		System.out.println(autumn.name());
		//oedinal() 输出的是该枚举对象的次序/编号，从0开始编号
		//AUTUMN 枚举对象是第四个，因此输出 3
		System.out.println(autumn.ordinal());

		//从反编译看出 values 方法，返回 Season[]
		//含有定义的所有枚举对象
		Season[] values = Season.values();
		System.out.println("===遍历取出枚举对象(增强for循环)===");
		for (Season season: values) {	//增强 for 循环
			System.out.println(season);
		}
	
		//valueOf：将字符串转换成枚举对象，
		//要求字符串必须为已有的常量名，否则报异常
		//
		//执行流程：
		//1.根据你输入的 “AUTUMN” 到 Season 的枚举对象去查找
		//2.如果找到就返回，没有就报错
		Season autumn1 = Season.valueOf("AUTUMN");
		System.out.println("autumn1 = " + autumn1);
		System.out.println(autumn == autumn1);

		//compareTo：比较两个枚举常量，比较的就是位置号
		//1.就是把 Season2.AUTUNIN 枚举对象的编号和 Season2.SUMMER枚举对象的编号比
		//2.返回的是 两个编号相减的结果数
		System.out.println(Season.AUTUMN.compareTo(Season.SUMMER));
	}
}

enum Season {	//类
	SPRING("春天","温暖"),WINTER("冬天","寒冷"),SUMMER("夏天","温暖"),AUTUMN("秋天","温暖");

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
