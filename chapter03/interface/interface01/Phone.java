//Phone 类 实现 UsbInterface
//1. 即 Phone 类需要实现 UsbInterface 接口 规定/声明的方法
public class Phone implements UsbInterface {	//实现接口
	@Override
	public void start() {
		System.out.println("手机开始工作...");
	}

	@Override
	public void stop() {
		System.out.println("手机停止工作...");	
	}
}
