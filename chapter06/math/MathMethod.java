public class MathMethod {
	public static void main(String[] args) {
		//Math 常用方法(静态方法)
		//1.abs 绝对值
		int abs = Math.abs(-9);
		System.out.println(abs);	//9

		//2.pow 求幂
		double pow = Math.pow(2, 4);	//2的4次方
		System.out.println(pow);	//16

		//3.ceil 向上取整，返回 >= 该参数的最小整数(转成double)
		double ceil = Math.ceil(-3.0001);
		System.out.println(ceil);	//-3.0

		double ceil1 = Math.ceil(3.001);
		System.out.println(ceil1);	//4.0

		//4.foor 向下取整，返回 <= 该参数的最大整数
		double floor = Math.floor(-4.999);
		System.out.println(floor);	//-5.0
		double floor1 = Math.floor(4.001);
		System.out.println(floor1);	//4.0

		//5.round 四舍五入 Math.foor(该参数+0.5)
		long round = Math.round(-5.001);
		System.out.println(round);	//-5
		long round1 = Math.round(-5.51);
		System.out.println(round1);	//-6

		//sqrt 求开方
		double sqrt = Math.sqrt(9.0);
		System.out.println(sqrt);	//3.0
		double sqrt1 = Math.sqrt(-9.0);
		System.out.println(sqrt1);	//NaN，不行，要大于0的数

		//7.random求随机数
		for (int i = 0; i < 10; i++) {
			System.out.println((int)Math.random());
		}
		// random返回的是0<= x<1之间的一个随机小数
		// 思考：请写出获取 a-b之间的一个随机整数,a, b均为整数，比如a = 2， b=7
		// 即返回一个数 x 2 <= x <= 7
		// 公式：(int)(a + random() * (b - a + 1))
		for (int j = 0; j < 10;  j++){
			System.out.println((int)(2 + Math.random() * (7 - 2 + 1)));
		}
	}
}
