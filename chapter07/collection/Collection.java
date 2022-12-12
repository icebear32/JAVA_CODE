import java.util.ArrayList;
import java.util.HashMap;

public class Collection {
	public static void main(String[] args) {
		//1，集合主要是两组(单列集合，双列集合)
		//2. Collection接口有两个重要的了接口 List Set ，他们的实现了类都是单列集合
		//3. Map接l的实现子类是双列集合，存放的 K-V
		// Colletion
		// Map
		ArrayList arrayList = new ArrayList();
		arrayList.add("jack");
		arrayList.add("tom");

		HashMap hashMap = new HashMap();
		hashMap.put("NO1", "北京");
		hashMap.put("NO2", "上海");
	}
}
