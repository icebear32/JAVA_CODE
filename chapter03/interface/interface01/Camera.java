//Camera 类 实现 UsbInterface
//1. 即 Camera 类需要实现 UsbInterface 接口 规定/声明的方法
public class Camera implements UsbInterface {	//实现接口，就是把接口的方法实现
	@Override	
	public void start() {
		System.out.println("相机开始工作...");
	}

	@Override
	public void stop() {
		System.out.println("相机停止工作...");	
	}
}