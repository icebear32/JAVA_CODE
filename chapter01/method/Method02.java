public class Method02 {
	public static void main(String[] args) {
		//遍历数组，输出数组的各个元素值
		int [][] map = { {0,0,1} , {1,1,1} , {1,1,3} };

		//传统方法：直接遍历数组
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		
		//要求再次遍历 - 麻烦，代码重复
		//使用方法完成输出
		MyTools tool = new MyTools();
		tool.printArr(map);
	}
}

//把输出的功能，写到类方法
class MyTools {
	public void printArr(int[][] map) {
		//对传入的 map 数组进行遍历输出
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
