import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    public static void main(String[] args) {
        //List接口的实现子类Vector LinkedList
        //List list = new ArrayList();	//跟下面 List 的遍历方式一样
        //List list = new Vector();	//跟下面 List 的遍历方式一样
        List list = new ArrayList();
        
        list.add("jack");
        list.add("tom");
        list.add("鱼香肉丝");
        list.add("北京烤鸭");
        
        //遍历
        //1.迭代器
        System.out.println("=====迭代器：=====");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }

        //2.增强 for
        System.out.println("=====增强 for=====");
        for (Object o : list) {
            System.out.println("o = " + o);
        }

        //2.传统 for
        System.out.println("=====传统for=====");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象 = " + list.get(i));
        }
    }
}