import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        //1．使用增强 for，在 Collection 集合
        //2. 增强 for，底层仍然是迭代器
        //3. 增强 for 可以理解成就是简化版本的迭代器遍历
        for (Object book : col) {
            System.out.println("book = " + book);
        }
    }
}

class Book {
    private String name;
    private String suthor;
    private double price;

    public Book(String name, String suthor, double price) {
        this.name = name;
        this.suthor = suthor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuthor() {
        return suthor;
    }

    public void setSuthor(String suthor) {
        this.suthor = suthor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", suthor='" + suthor + '\'' +
                ", price=" + price +
                '}';
    }
}
