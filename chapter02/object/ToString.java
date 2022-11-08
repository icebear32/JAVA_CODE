public class ToString {
	public static void main(String[] args) {
		/**
 		* 
 		* object的toString()源码
 		* (1)getClass().getName()类的全类名(包名+类名)
 		* (2)Integer.toHexString(hashCode()）将对象的hashCode值转成16进制字符串
 		* public String toString() {
 		* 	return getClass().getName() + "@" +Integer.toHexString(hashCode()); 
 		* }
 		*
 		* */

		Monster monster = new Monster("小妖怪", "巡山的", 1000);
		System.out.println(monster.toString());

		System.out.println("== 重写toString方法，打印对象或拼接对象时，都会自动调用该对象的 toString 形式  ==");	
		System.out.println(monster);	//等价于 monster.toString()
	}
}

class Monster {
	private String name;
	private String job;
	private double sal;

	public Monster(String name, String job, double sal) {
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	//重写 toString 方法，输出对象的属性
	@Override
	public String toString() {	//重写后，一般把对象的属性输出，也可以定制 toString 方法
		return "Monster{" + 
			"name="+ name + '\n' + 
			", job=" + job + '\n' + 
			", sal=" + sal + 
			'}';
	}
}
