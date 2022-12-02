import java.math.BigInteger;

public class BigInteger01 {
    public static void main(String[] args) {
        // 当我们编程中，需要处理很大的整数，
        // long 不够用'可以使用BigInteger的类来搞定
//        long l = 237888888999999999999999999l;
//        System.out.println("l = " + l);

        BigInteger bigInteger = new BigInteger("237888888999999999999999999");
        BigInteger bigInteger2 = new BigInteger("100000000000000000000000000");
        System.out.println(bigInteger);
        //1.在对 BigInteger进行加减乘除的时候，需要使用对应的方法，不能直接进行 + – * /
        //2.
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);    //加
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);   //减
        BigInteger muliply = bigInteger.multiply(bigInteger2);
        System.out.println(muliply);    //乘
        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);     //除
    }
}