import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1, 20, 90};
        //遍历数组
        System.out.println("遍历数组");
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);
        }

        //直接使用 Arrays.toString 方法,显示数组
        System.out.println("直接使用 Arrays.toString 方法,显示数组:");
        System.out.println(Arrays.toString(integers));

        //sort 方法的使用
        Integer arr[] = {1, -1, 7, 0, 89};
        //进行排序
        //1.可以直接使用冒泡排序，也可以直接使用Arrays提供的sort方法排序
        //2.因为数组是引用类型，所以通过sort排序后，会直接影响到实参 arr
        //3.sort重载的,也可以通过传入一个接口 Comparator实现定制排序
        //Arrays.sort(arr);//默认排序方法定制排序
        //
        //4.调用定制排序时，传入两个参数
        //  (1)排序的数组arr
        //  (2)实现了 Comparator 接口的匿名内部类
//        Arrays.sort(arr, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        });
        //5.运行代码
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                //return i1 - i2;   //代码运行，排列没变化
                return i2 - i1;
            }
        });
        //6.体现了接口编程的方式
        //  源码分析
        //  (1)Arrays.sort(arr, new Comparator()
        //  (2) 最终到 TimSort 类的 private static <T> void sort(T[] a, Comparator<? super T> c) {}
        //  (3) 执行到 binarySort 方法的代码，会根据动态绑定机制 c.compare() 执行我们传入的匿名内部类的 compare()
        //  while (left < right) {
        //                int mid = (left + right) >>> 1;
        //                if (c.compare(pivot, a[mid]) < 0)
        //                    right = mid;
        //                else
        //                    left = mid + 1;
        //            }
        //
        //  (4) new Comparator() {
        //            @Override
        //            public int compare(Object o1, Object o2) {
        //                Integer i1 = (Integer)o1;
        //                Integer i2 = (Integer)o2;
        //                //return i1 - i2;   //代码运行，排列没变化
        //                return i2 - i1;
        //            }
        //
        //  (5) public int compare(Object o1, Object o2) 返回的值>0 还是 <0
        //      会影响整个排序结果，这就充分体现了 接口编程 + 动态绑定机制 + 匿名内部类的综合使用
        System.out.println("=====排序后=====");
        System.out.println(Arrays.toString(arr));
    }
}