//public class PC extends Computer {
//	//刚建立就报错，是因为父类没有无参构造器了，子类 PC 没有找到就报错
//}

/* 编写 PC 子类，继承 Computer 类，添加特有属性【品牌brand】 */
public class PC extends Computer {
	private String brand;
	
	//根据继承规则，调用父类的有参构造器
	//继承设计的基本思想，父类的构造器完成父类属性的初始化
	//子类的构造器完成子类属性的初始化
	public PC(String cpu, int memory, int disk, String brand) {
		super(cpu, memory, disk);	//super 调用有参构造器，避免报错
		this.brand = brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void printInfo() {
		System.out.println("PC信息：");
		//System.out.println(getCpu() + getMemory() + getDisk());
		//调用父类的 getDetails 方法，得到相关属性
		System.out.println(getDetails() + " brand = " + brand);
	}
}