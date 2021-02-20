package day14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Product {
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	class PriceComparator implements Comparator<Product>{

		@Override
		public int compare(Product o1, Product o2) {
			if(o1.price==o2.price)
				return 0;
			else if(o1.price>o2.price)
				return 1;
			return -1;
		}
		
	}

	
}


public class ComparatorDemo {
public static void main(String[] args){
	ArrayList<Product> productList=new ArrayList<Product>();
	productList.add(new Product(100,"laptop",56000));
	productList.add(new Product(106,"laptop1",66000));
	productList.add(new Product(100,"laptop2",46000));
	for(Product p:productList){
		System.out.println(p.id+" "+p.name+" "+p.price);
	}
	Collections.sort(productList,new PriceComparator());
	System.out.println("====after sorting===");
	for(Product p:productList)
	{
		System.out.println(p.id+" "+p.name+" "+p.price);
	}
	
}
}
