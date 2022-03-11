package onlineshopping.onlineshopapp;

import java.util.List;

public class Cart {
	private List<Product> productList;
	private User user; 
	private float total_amount;
    private boolean status;
	private boolean confirmorder;
	
	public boolean isConfirmorder() {
		return confirmorder;
	}
	public void setConfirmorder(boolean confirmorder) {
		this.confirmorder = confirmorder;
	}
	
	public Cart(User user) {
		super();
		this.user = user;
	}
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public float getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(float total_amount) {
		
		this.total_amount = total_amount;
	}
}