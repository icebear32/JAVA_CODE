import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list = " + list);

        //在 2号位插入一个元素 “ygh”
        list.add(1,"ygh");
        System.out.println("list = " + list);

        //获得第五个元素
        System.out.println("第五个元素 = " + list.get(4));

        //删除第六个元素
        list.remove(5);
        System.out.println("list = " + list);

        //修改第七个元素
        list.set(6,"三国演义");
        System.out.println("list = " + list);

        //在使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next = " + next);
        }
    }
}
