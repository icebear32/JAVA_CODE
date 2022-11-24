public class Exercise02 {
	public static void main(String[] args) {
		//args.length = 0
		//这里发生的是 ArrayIndexOutOfBoundsException
		try {
			if (args[4].equals("join")) {
				System.out.println("AA");
			} else {
				System.out.println("BB");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("异常信息1：" + e.getMessage());
				e.printStackTrace();
		}
		
		System.out.println("============================>");

		try {
			String[] arr = new String[]{"aa","bb"};
			arr[1] = null;
			if (arr[1].equals("join")) {	//发生NullPointerException
				System.out.println("AA");
			} else {
				System.out.println("BB");
			}
		} catch(NullPointerException e) {
			System.out.println("异常信息2：" + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("============================>");

		try {
			String[] arr1 = new String[]{"aa","bb"};
			Object o = arr1[1];	//String->Object，向上转型
			Integer i = (Integer)o;	//错误，一定发生 classCastException
		} catch (ClassCastException e) {
			System.out.println("异常信息3：" + e.getMessage());
			e.printStackTrace();
		}
	}
}