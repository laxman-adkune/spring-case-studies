package com.multiplex.Model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="shows")
public class Shows implements Serializable{
	
	public Shows() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ShowId", length = 10, unique = true)
	private int ShowId;
	
	@Column(name="SlotNo", length = 100)
	private int SlotNo;
	
	@Column(name="FromDate", length = 100)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date FromDate;
	
	@Column(name="ToDate", length = 100)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date ToDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "MovieId")
	private Movies movies;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "HallId")
	private Hall hall;
	
	@OneToOne(mappedBy = "shows")
	private Booking booking;
	
	public int getShowId() {
		return ShowId;
	}
	public void setShowId(int showId) {
		ShowId = showId;
	}
	public Movies getMovies() {
		return movies;
	}
	public void setMovies(Movies movies) {
		this.movies = movies;
	}
	public Hall getHall() {
		return hall;
	}
	public void setHall(Hall hall) {
		this.hall = hall;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public int getSlotNo() {
		return SlotNo;
	}
	public void setSlotNo(int slotNo) {
		SlotNo = slotNo;
	}
	public Date getFromDate() {
		return FromDate;
	}
	public void setFromDate(Date fromDate) {
		FromDate = fromDate;
	}
	public Date getToDate() {
		return ToDate;
	}
	public void setToDate(Date toDate) {
		ToDate = toDate;
	}
	@Override
	public String toString() {
		return "Shows [ShowId=" + ShowId + ", movies=" + movies + ", hall=" + hall + ", SlotId=" + SlotNo
				+ ", FromDate=" + FromDate + ", ToDate=" + ToDate + "]";
	}
}
