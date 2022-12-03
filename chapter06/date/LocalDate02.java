import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate02 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();

        // 使用 DateTimeFOrmatter 对象来进行格式化
        // 创建 DateTimeFormatter 对象
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String format = dateTimeFormatter.format(ldt);
        System.out.println("格式化的日期 = " + format);
    }
}