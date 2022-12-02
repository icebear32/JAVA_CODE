import java.math.BigDecimal;

public class BigDecimal01 {
    public static void main(String[] args) {
        double d = 1999.1111111111111111199999999999999999999999999999d;
        System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("1999.1111111111111111199999999999999999999999999999");
        System.out.println(bigDecimal);

        // 1．如果对 BigDecimal进行运算，比如加减乘除，需要使用对应的方法1
        // 2．创建一个需要操作的BigDecimal然后调用相应的方法即可
        BigDecimal bigDecimal2 = new BigDecimal("1");
        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.subtract(bigDecimal2));
        System.out.println(bigDecimal.multiply(bigDecimal2));
        System.out.println(bigDecimal.divide(bigDecimal2)); //除不尽可能抛出 ArithmeticException 异常
        //解决：在调用 divide 方法时，指定精度即可
        //如果有无限循环小数，就会保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal2, BigDecimal.ROUND_CEILING));
    }
}