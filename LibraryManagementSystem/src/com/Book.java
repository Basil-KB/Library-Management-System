package com;

public class Book {
	private String title;
	private String author;
	private boolean isIssued;
	private User issuedTo;
	
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
		this.isIssued=false;
		this.issuedTo = null;
		
	}

	public String getTitle() {
		return title;
	}
	public User getIssuedTo() {
        return issuedTo;
    }

	public void issueBook(User user) {
		 isIssued = true;
		 issuedTo = user;
		
	}
	 public void returnBook() {
	        isIssued = false;
	        issuedTo = null;
	    }

	public boolean isIssued() {
		
		return isIssued;
	}
	@Override
    public String toString() {
        return title + " by " + author + (isIssued ? " [Issued to " +issuedTo.getName()+"] ": " [Available]");
    }
}
