import java.time.Instant;
import java.util.Date;

public class Instant01 {
    public static void main(String[] args) {
        //1.通过静态方法now()获取表示当前时间截的对象
        Instant now = Instant.now();
        System.out.println(now);
        //2．通过from可以把 Instant转成 Date
        Date date = Date.from(now);
        //3．通过date的toInstant() 可以把 date 转成Instant对象
        Instant instant = date.toInstant();
    }
}