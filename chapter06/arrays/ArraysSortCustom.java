import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr1 = {1, -1, 8, 0, 20};
        bubble01(arr1);

        System.out.println("== arr1 传统排序后的情况==");
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, -1, 8, 0, 20};
        bubble02(arr2, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;
                return i1 - i2; //return i2 - i1;
            }
        });
        System.out.println("== arr2 定制从小到大排序后的情况==");
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, -1, 8, 0, 20};
        bubble02(arr3, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer)o1;
                int i2 = (Integer)o2;
                return i2 - i1; //return i2 - i1;
            }
        });
        System.out.println("== arr3 定制从大到小排序后的情况==");
        System.out.println(Arrays.toString(arr3));
    }

    //使用冒泡完成排序
    public static void bubble01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                //从小到大排序
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //结合冒泡 + 定制
    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                //数组排序由 c.compare(arr[j], arr[j+1])返回的值决定
                if (c.compare(arr[j], arr[j+1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}