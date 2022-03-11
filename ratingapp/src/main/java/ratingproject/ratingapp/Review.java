package ratingproject.ratingapp;

import java.util.List;

public class Review {

	private int reviewid;
    private Financialproduct financialproduct_reviewed;
	private String review_text;
	private List<Comment> comments;
	
	public int getReviewid() {
		return reviewid;
	}
	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}
	
	public Financialproduct getFinancialproduct_reviewed() {
		return financialproduct_reviewed;
	}
	public void setFinancialproduct_reviewed(Financialproduct financialproduct_reviewed) {
		this.financialproduct_reviewed = financialproduct_reviewed;
	}
	public String getReview_text() {
		return review_text;
	}
	public void setReview_text(String review_text) {
		this.review_text = review_text;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
    public Review(int reviewid, Financialproduct financialproduct_reviewed,String review_text, List<Comment> comments) {
		super();
		this.reviewid = reviewid;
		this.financialproduct_reviewed = financialproduct_reviewed;
		this.review_text = review_text;
		this.comments = comments;
	}
	
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
