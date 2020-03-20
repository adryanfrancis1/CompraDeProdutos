package entities;

public class OrderItem {

	private Product product;
	private Integer quantity;
	private Double price;
	
	
	public OrderItem() {
		
	}
	
	public OrderItem(Product product, Double price, Integer quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		
	}



	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return product.getName() 
		+ ", $" + String.format("%.2f", price) + ", " 
		+ "Quantity: " + quantity + ", " 
		+ "SubTotal: " + String.format("%.2f", subTotal());
		
		
		
		
	}
	
	
	
}
