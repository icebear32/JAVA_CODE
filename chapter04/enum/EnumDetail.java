public class EnumDetail {
	public static void main(String[] args) {
		Music.CLASSMUSIC.playing();	
	}
}

//1.使用enum关键字后，就不能再继承其它类了，
//因为 enum 会隐式继承 Enum 而 Java 是单继承机制
//
//class A {}
//enum Season extends A {}	//报错，不可以
//
//2.枚举类和普通类一样，可以实现接口
interface IPlaying {
	public void playing();
}

enum Music implements IPlaying {
	CLASSMUSIC;

	@Override
	public void playing() {
		System.out.println("播放音乐...");
	}
}
