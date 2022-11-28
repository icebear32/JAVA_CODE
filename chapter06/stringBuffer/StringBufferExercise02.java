public class StringBufferExercise02 {
	public static void main(String[] args) {
		/** 
 		 * 输入商品名称和商品价格，要求打印效果示例，
 		 * 商品名―商品价格
 		 * 手机 123,564.59 //比如价格3,456,789.88
 		 * 要求：价格的小数点前面每三位用逗号隔开，在输出
 		 *
 		 */

		String price = "123456.58";
		StringBuffer sb = new StringBuffer(price);
		//
		//
		//int i = sb.lastIndexOf(".");
		//sb = sb.insert(i - 3, ",");
		
		//上面两部需要做一个循环处理，才是正确的
		//for (int i = sb.lastIndexOf("."); i > 0; i -= 3) {
		//	sb = sb.insert(i - 3, ",");
		//}
		//	输出的结果不是 123,456.58
		//	而是 ,123,456,58
		//	添加多一次逗号
		//	
		//	改正：不应该是在找到点号进入循环再做做减3操作
		//		而是在获得点号之后就做减3操作，再做判断
		//
		for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
			sb = sb.insert(i, ",");
		}
		System.out.println(sb);	//123,456.58
	}
}
