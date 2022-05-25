package ecommerce.model;

import java.time.LocalDateTime;

public class Product {

	String productName;
	String productBrand;
	int rating;
	double price;
	LocalDateTime date;
	public Product(String productName, String productBrand, int rating, double price, LocalDateTime localDateTime) {
		super();
		this.productName = productName;
		this.productBrand = productBrand;
		this.rating = rating;
		this.price = price;
		this.date = localDateTime;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productBrand=" + productBrand + ", rating=" + rating
				+ ", price=" + price + ", date=" + date + "]";
	}
	
}
