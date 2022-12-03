import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate03 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //提供plus 和 minus方法可以对当前时间进行加或者减
        //看看890天后，是什么时候把年月日-时分秒
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890天后 = " + dateTimeFormatter.format(localDateTime));

        //看看在 3456 分钟前是什么时候,把年月日-时分秒输出
        LocalDateTime localDateTime2 = ldt.minusMinutes(3456);
        System.out.println("3456分钟前 日期 = " + dateTimeFormatter.format(localDateTime2));
    }
}