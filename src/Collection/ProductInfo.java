package Collection;

import java.util.Scanner;

public class ProductInfo {

	public void initInfo()
	{
		System.out.println("Enter Product Details:");
		Scanner scanner=new Scanner(System.in);
		ProductList productlist=new ProductList();
		productlist.createProductList(scanner);
	}
}
