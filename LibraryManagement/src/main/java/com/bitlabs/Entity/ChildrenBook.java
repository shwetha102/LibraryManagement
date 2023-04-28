package com.bitlabs.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChildrenBook {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	private String bookType;
	  private String bookName;
	  
  public ChildrenBook() {
		super();
		// TODO Auto-generated constructor stub
	}
public ChildrenBook(String bookType, String bookName) {
		super();
		bookType = bookType;
		bookName = bookName;
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		bookType = bookType;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		bookName = bookName;
	}

  
  
	
}

