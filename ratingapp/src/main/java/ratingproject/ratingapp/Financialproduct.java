package ratingproject.ratingapp;

public class Financialproduct {
	
	private int financialproductid;
	private String financialproduct_name;
	private String description;
	private int rating;
	private Review review;
	public int getFinancialproductid() {
		return financialproductid;
	}
	public void setFinancialproductid(int financialproductid) {
		this.financialproductid = financialproductid;
	}
	public String getFinancialproduct_name() {
		return financialproduct_name;
	}
	public void setFinancialproduct_name(String financialproduct_name) {
		this.financialproduct_name = financialproduct_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	public Financialproduct(Review review) {
		super();
		this.review = review;
	}
	public Financialproduct() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	

}
