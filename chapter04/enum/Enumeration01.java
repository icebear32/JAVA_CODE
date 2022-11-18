public class Enumeration01 {
	public static void main(String[] args) {
		//使用
		Season spring = new Season("春天","温暖");	
		Season winter = new Season("冬天","寒冷");	
		Season summer = new Season("夏天","炎热");	
		Season autumn = new Season("秋天","凉爽");
		//
		//autumn.setName("XXX");
		//autumn.setDesc("非常热...");
		//不好用 set 方法
		//
		//季节固定值
		//因为对于季节而言，他的对象(具体值)，是固定的四个，不会有更多
		//按照设计类的思路，不能体现季节是固定的四个对象
		//因此这样的设计不好，===> 枚举类
	}
}

class Season {	//类
	private String name;
	private String desc;	//描述

	//构造器
	public Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc() {
		this.desc = desc;
	}
}
