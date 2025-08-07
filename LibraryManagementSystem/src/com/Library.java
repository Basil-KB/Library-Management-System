package com;

import java.util.ArrayList;

public class Library {
	 private ArrayList<Book> books;
	 private ArrayList<User> users;
	public Library() {
		books = new ArrayList<>();
        users = new ArrayList<>();
	}
	public void addBook(Book book) {
        books.add(book);
    }
	public void registerUser(User user) {
        users.add(user);
    }
	// find user id for add user data to book 
	private User findUserById(int userId) {
		for (User user : users) {
	        if (user.getUserId() == userId) {
	            return user;
	        }
	    }
	    return null;
	}
	// store the issue book details
	 public void issueBook(String title, int userId) {
		 User user = findUserById(userId);
		 if (user == null) {
		        System.out.println("User not found.");
		        return;
		  }else {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
	                book.issueBook(user);
	                System.out.println("Book issued to : " + user.getName());
	                return;
	            }
	        }
		  }
	        System.out.println("Book not available or already issued.");
	    }
	 public void returnBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
	                book.returnBook();
	                System.out.println("Book returned.");
	                return;
	            }
	        }
	        System.out.println("Book not found or already returned.");
	    }
	 public void displayBooks() {
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
	 public void displayUsers() {
	        for (User user : users) {
	            System.out.println(user);
	        }
	    }
}
