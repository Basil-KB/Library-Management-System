package com;

import java.util.Scanner;

public class LibarayManagement {
	  public static void main(String[] args) {
	        Library library = new Library();
	        Scanner scanner = new Scanner(System.in);

	        // sample data 
	        library.addBook(new Book("Clean Code", "Robert Cecil Martin"));
	        library.addBook(new Book("Head First Java", "Bert Bates and Kathy Sierra"));
	        library.registerUser(new User("Basil", 1));
	        library.registerUser(new User("Babu", 2));

	        while (true) {
	            System.out.println("\nLibrary Menu:");
	            System.out.println("1. Display Books");
	            System.out.println("2. Display Users");
	            System.out.println("3. Issue Book");
	            System.out.println("4. Return Book");
	            System.out.println("5. Add Book");
	            System.out.println("6. Add User");
	            System.out.println("7. Exit");

	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume leftover newline

	            switch (choice) {
	                case 1:
	                    library.displayBooks();
	                    break;
	                case 2:
	                    library.displayUsers();
	                    break;
	                case 3:
	                    System.out.print("Enter book title to issue: ");
	                    String issueTitle = scanner.nextLine();
	                    System.out.print("Enter User ID: ");
	                    int userId = scanner.nextInt();
	                    library.issueBook(issueTitle, userId);
	                    break;
	                case 4:
	                    System.out.print("Enter book title to return: ");
	                    String returnTitle = scanner.nextLine();
	                    library.returnBook(returnTitle);
	                    break;
	                case 5:
	                	System.out.print("Enter book title to issue: ");
	                    String bookTitle = scanner.nextLine();
	                    System.out.print("Enter author name: ");
	                    String author = scanner.nextLine();
	                    library.addBook(new Book(bookTitle, author));
	                    System.out.println("Book Added to Library System.");
	                    break;
	                case 6:
	                	System.out.print("Enter User Name: ");
	                    String userName = scanner.nextLine();
	                    System.out.print("Enter User Id: ");
	                    int id = scanner.nextInt();
	                    library.registerUser(new User(userName, id));
	                    System.out.println("User Added to Library System.");
	                    break;
	                case 7:
	                    System.out.println("Exiting Library System.");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}