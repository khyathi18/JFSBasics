package Collection;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import ecommerce.model.Product;

public class ProductList {

	public void createProductList(Scanner scanner)
	{
		List <Product> product_no=new LinkedList<Product>();
		product_no.add(new Product("OnePlus Nord CE 2 Lite 5G","OnePlus",4,19999.00,LocalDateTime.now()));
		Product p1=new Product("Samsung Galaxy S20 FE 5G","Samsung",5,34990.00,LocalDateTime.now());
		product_no.add(p1);
		Product p2=new Product(scanner.next(),
				scanner.next(),
				scanner.nextInt(),
				scanner.nextDouble(),
				LocalDateTime.now());
		product_no.add(p2);
	//	List <Product> p3=List.of(new Product("Samsung Galaxy M33 5G ","Samsung",4,17999.00,LocalDateTime.now()), new Product("OPPO F21 Pro","Oppo",4,25999.00,LocalDateTime.now()));
		List<Product> productno1=Arrays.asList(new Product("Samsung Galaxy M33 5G ","Samsung",4,17999.00,LocalDateTime.now()),
				new Product("OPPO F21 Pro","Oppo",4,25999.00,LocalDateTime.now()));
		product_no.forEach(System.out::println);
		System.out.println("///////////////////");
		for(Product i:product_no)
			System.out.println(i);
//		System.out.println("using List.of() Method");
//		productno.forEach(System.out::println);
		System.out.println("////////using Arrays.asList() method////////");
		productno1.forEach(System.out::println);
		Stream s=product_no.stream();
		s.filter(item->item.getPrice()>20000).filter(product->product.getProductBrand()=="Oppo");
}
}