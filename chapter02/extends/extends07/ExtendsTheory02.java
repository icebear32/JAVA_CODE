/* 讲解继承的本质 */
public class ExtendsTheory02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Son son = new Son();	//内存的布局
			
			//注意，按照查找关系来返回信息
			//首先看子类是否有该属性
			//如果子类有这个属性，并且可以访问，则返回信息
			//如果子类没有这个属性，就看父类有没有这个属性(如果父类有该属性，并且可以访问，就返回信息..)
			//如果父类没有就按照(3)的规则，继续找上级父类，直到Object...
			System.out.println(son.name);	//返回 大头儿子
			
			//System.out.println(son.age);	//返回 39
			//无法访问私有属性
			System.out.println(son.getAge());	//返回 39
			
			System.out.println(son.hobby);	//返回 旅游
			
			//即使爷爷类有 money 属性，也会报错
			//因为无法跳过 父类的私有属性 money
			//System.out.println(son.money);
	}

}

