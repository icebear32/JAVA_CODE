public class InnerExercise02 {
	public static void main(String[] args) {
		//有一个铃声接口Bell，里面有个ring方法
		//有一个手机类cellphone，具有闹钟功能alarmclock，参数是Bell类型
		//测试手机类的闹钟功能,通过匿名内部类(对象)作为参数,打印:懒猪起床了
		//再传入另一个匿名内部类(对象)，打印:小伙伴上课了
		CellPhone cellPhone = new CellPhone();
		cellPhone.alarmClock(new Bell() {
			@Override
			public void ring() {
				System.out.println("懒猪起床了...");
			}
		});

		cellPhone.alarmClock(new Bell() {
			@Override
			public void ring() {
				System.out.println("上课了...");
			}
		})
	}
}

interface Bell {	//接口
	void ring();	//方法
}

class CellPhone {	//类
	public void alarmclock(Bell bell) {	//方法
		bell.ring;
	}
}
