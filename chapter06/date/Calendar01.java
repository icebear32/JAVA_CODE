import java.util.Calendar;

public class Calendar01 {
    public static void main(String[] args) {
        //1. Calendar 是一个抽象类，并且构造器是 private
        //2. 可以通过 getInstance() 来获取实例
        //3. 提供大量的方法和字段提供给程序员
        Calendar c = Calendar.getInstance();
        System.out.println("c=" + c);   //创建日历类对象//比较简单，自由

        //2. 获取日历对象的某个日历字段
        System.out.println("年：" + c.get(Calendar.YEAR));
        //这里为什么要 + 1，因为 CaLendar 返回月时候，是按照0开始编号
        System.out.println("月：" + c.get(Calendar.MONTH) + 1);
        
        System.out.println("日：" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时：" + c.get(Calendar.HOUR));
        System.out.println("分钟：" + c.get(Calendar.MINUTE));
        System.out.println("秒：" + c.get(Calendar.SECOND));

        // CaLender 没有专门的格式化方法，所以需要程序员自己来组合显示
        System.out.println(c.get(Calendar.YEAR) + "年-" +
                (c.get(Calendar.MONTH) + 1) + "月-" +
                c.get(Calendar.DAY_OF_MONTH) + "日 " +
                c.get(Calendar.HOUR_OF_DAY) + "时:" +
                c.get(Calendar.MINUTE) + "分:" +
                c.get(Calendar.SECOND) + "秒");
    }
}