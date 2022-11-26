import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,90,123,567};
        //binarySearch 通过二分搜索法进行查找，要求必须排序好
        //1.使用binarySearch二叉查找
        //2.要求该数组是有序的。如果该数组是无序的,不能使用binarySearch
        //3.如果数组中不存在该元素，就返回 return -(low + 1);  // key not found.
        int index = Arrays.binarySearch(arr, -123);
        System.out.println("index = " + index); //-1

        index = Arrays.binarySearch(arr, 1);
        System.out.println("index = " + index);

        //3.如果数组中不存在该元素，就返回 return -(low + 1);  // key not found.
        index = Arrays.binarySearch(arr, 568);
        System.out.println("index = " + index);//返回的是 -6

        //copyOf 数组元素的复制
        //1.从 arr 数组中，拷贝 arr.length 个元素 newArr 数组中
        Integer[] newArr = Arrays.copyOf(arr, arr.length-1);
        System.out.println("==拷贝执行完毕后==");
        System.out.println(Arrays.toString(newArr));
        //2.如果拷贝的长度 >arr.length 就在新数组的后面 增加 null
        Integer[] newArr2 = Arrays.copyOf(arr, arr.length+1);
        System.out.println("==拷贝执行完毕后==");
        System.out.println(Arrays.toString(newArr2));
        //4.如果拷贝长度 =0 就拷贝空数组
        Integer[] newArr3 = Arrays.copyOf(arr, 0);
        System.out.println("==拷贝执行完毕后==");
        System.out.println(Arrays.toString(newArr3));
        //4.如果拷贝长度 <0 就抛出异常 NegativeArraySizeException
        //5.该方法的底层使用的是System. arraycopy()
//        Integer[] newArr4 = Arrays.copyOf(arr, -1);
//        System.out.println("==拷贝执行完毕后==");
//        System.out.println(Arrays.toString(newArr4));

        //fill 数组元素的填充
        Integer[] num = new Integer[]{9, 3, 2};
        //1.使用 99 去填充 num 数组，可以理解成替换原理的元素
        Arrays.fill(num, 99);
        System.out.println("==数组填充后==");
        System.out.println(Arrays.toString(num));

        //equals 比较两个数组元素内容是否完全一致
        Integer[] arr2 = {1, 2, 90, 123};
        //1.如果 arr 和 arr2 数组的元素一样，则方法 true
        //2.如果不是完全一样，就返回 false
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println("equals = " + equals);

        //aList 将一组值，转换成 list
        //1. asList方法，会将（2，3，4，5，6，1）数据转成一个 List 集合
        //2. 返回的 asList 编译类型 List（接口）
        //3. asList的运行类型 class java.util.Arrays$ArrayList
        //   是 Arrays 类的静态内部类
        //
        //   private static class ArrayList<E> extends AbstractList<E>
        //        implements RandomAccess, java.io.Serializable
        //
        List asList = Arrays.asList(2, 3, 4, 5, 6, 1);
        System.out.println("aList = " + asList);
        System.out.println("asList的运行类型 " + asList.getClass());
    }
}