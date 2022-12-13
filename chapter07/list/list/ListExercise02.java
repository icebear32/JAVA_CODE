import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all"})
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦",100,"曹雪芹"));
        list.add(new Book("西游记",109,"吴承恩"));
        list.add(new Book("水浒传",108,"施耐庵"));
        list.add(new Book("三国志",107,"陈寿"));

        //遍历
        for (Object o : list) {
            System.out.println(o);
        }

        //冒泡排序
        sort(list);
        System.out.println("=====排序后=====");
        for (Object o :list) {
            System.out.println(o);
        }

    }
    //静态方法
    //排序：价格要求是从小到大
    public static void sort(List list) {
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            for (int j = 0; j < listSize - 1; j++) {
                //取出对象Book
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {  //交换
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}

class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t\t价格：" + price + "\t\t作者：" + author;
    }
}