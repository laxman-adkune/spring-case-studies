package ratingproject.ratingapp;

public class Comment {
	private int comment_id;
	private String comment_text;
	private int likes;
	private int dislikes;
	private boolean report;
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public String getComment_text() {
		return comment_text;
	}
	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDislikes() {
		return dislikes;
	}
	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	public boolean isReport() {
		return report;
	}
	public void setReport(boolean report) {
		this.report = report;
	}
	public Comment(int comment_id, String comment_text, int likes, int dislikes, boolean report) {
		super();
		this.comment_id = comment_id;
		this.comment_text = comment_text;
		this.likes = likes;
		this.dislikes = dislikes;
		this.report = report;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	

}
