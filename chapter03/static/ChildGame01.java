public class ChildGame01 {
	public static void main(String[] args) {
		//定义一个变量 count，统计有多少小孩加入了游戏
		int count = 0;	
	
		Child child1 = new Child("雪人1");
		child1.join();
		count++;
	
		Child child2 = new Child("雪人2");
		child2.join();
		count++;
	
		Child child3 = new Child("雪人3");
		child3.join();
		count++;

		//--------------------------------

		System.out.println("共有 " + count + " 个雪人加入游戏...");
	}
}

class Child {
	private String name;
	
	public Child(String name) {
		this.name = name;
	}

	public void join() {
		System.out.println(name + "加入了游戏");
	}
}
