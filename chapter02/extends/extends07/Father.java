class Father extends GrandPa {	//父类
	String name = "大头爸爸";
	//int age = 39;
	//改成私有属性
	private int age = 39;	//设置为私有属性
	
	private double money = 9000;
	
	//设置方法
	public int getAge() {
		return age;
	}
}