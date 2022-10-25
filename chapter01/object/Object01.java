public class Object01{
	//编写一个mian方法
	public static void mian(String[] args){
		//两只猫 - 单独变量表示猫信息 => 不利于数据的管理
		String cat1Name = "小白";
		String cat2Name = "小花";

		int cat1Age = 3;
		int cat2Age = 100;

		String cat1Color = "白色";
		String cat2Color = "花色";

		//数组表示 ==> 数据类型体现不出
		//获取信息要下标，造成变量名字和内容的对应关系不明确
		//不能体现猫的行为
		String[] cat1 = {"小白","3","白色"};
		String[] cat2 = {"小花","100","白色"};
	}	
}
