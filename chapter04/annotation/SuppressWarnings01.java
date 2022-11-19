import java.util.List;
import java.util.ArrayList;

public class SuppressWarnings01 {
	//1，当我们不希望看到这些警告的时候，可以使用SuppressWarnings注解来抑制警告信息
	//2，在{""}中，可以写入你希望抑制(不显示)警告信息
	//3，可以指定的警告类型
	//4. 关于SuppressWarnings 作用范围是和你放置的位置相关
	//   比如 @SuppressWarnings放置在main方法，那么抑制警告的范围就是 main
	//	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("jack");
		list.add("tom");
		list.add("mary");
		int i;
		System.out.println(list.get(1));
	}

	//这里警告还是显示
	//因为上面的 SuppressWarnings的作用范围在 main 函数
	//解决方法：这里再加 SuppressWarnings
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void f1() {
		List list = new ArrayList();
		list.add("jack");
                list.add("tom");
                list.add("mary");
                int i;
                System.out.println(list.get(1));
	}
}
