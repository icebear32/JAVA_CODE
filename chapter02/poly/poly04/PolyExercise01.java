public class PolyExercise01 {
	public static void main(String[] args) {
		double d = 3.14;
		long l = (long)d;	//正确
		System.out.println(l);	//13

		int in = 5;	//正确
		//boolean b = (boolean)in;	//不对， booolean -> int
		
		Object obj = "hello";	//可以，向上转型
		String objStr = (String)obj;	//可以，向下转型
		System.out.println(objStr);	//hello

		Object objPri = new Integer(5);	//可以，向上转型
		//String str = (String)objPro;	//错误ClassCastException，指向Integer的父类引用，转成String
		Integer str1 = (Integer)objPri;	//可以，向下转型
	}
}
