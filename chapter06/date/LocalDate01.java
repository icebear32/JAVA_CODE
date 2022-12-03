import java.time.LocalDateTime;

public class LocalDate01 {
    public static void main(String[] args) {
        //第三代日期
        //1. 使用 now() 返回表示当前日期时间的对象
        LocalDateTime ldt = LocalDateTime.now();
        //LocalDate.now();  //返回日期
        //LocalTIme.now();  //返回时间
        System.out.println(ldt);

        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("月=" + ldt.getMonthValue());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());
    }
}