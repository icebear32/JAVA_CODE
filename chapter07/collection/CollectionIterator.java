import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    	@SuppressWarnings({"all"})
    	public static void main(String[] args) {
        	Collection col = new ArrayList();
	        col.add(new Book("三国演义", "罗贯中", 10.1));
        	col.add(new Book("小李飞刀", "古龙", 5.1));
	        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        	//System.out.println("col = " + col);
	        //遍历 col 集合
        	//1.先得到 col 对应的 迭代器
	        Iterator iterator = col.iterator();
        	//2.使用 while 循环遍历
	        while (iterator.hasNext()) {
        	    //返回下一个元素，类型是 Object
	            Object obj = iterator.next();
        	    System.out.println("obj = " + obj);
        	}
	         //3.当退出 while 循环后，这是 iterator 迭代器，指向最后的元素
        	//iterator.next();    //会出现 NoSuchElementException 异常
	        //4、如果希望再次遍历，需要重置迭代器
        	iterator = col.iterator();
	        System.out.println();
        	while (iterator.hasNext()) {
	            Object obj =  iterator.next();
        	    System.out.println("obj = " + obj);
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
