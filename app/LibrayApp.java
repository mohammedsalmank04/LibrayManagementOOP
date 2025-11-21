package app;

import model.Book;
import model.EBook;
import model.PrintedBook;
import service.Library;

import java.util.Scanner;

public class LibrayApp {

    private static Library library = new Library();
   private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;

        System.out.println("===========================================");
        System.out.println("Welcome to library");
        System.out.println("===========================================");

        while(choice != 6){
            showMenu();
            System.out.println("Enter Your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 1:
                    addBookMenu();
                    break;
                default:
                    break;

            }
        }
    }

    private static void showMenu(){
        System.out.println("\n------------ MENU --------------");
        System.out.println("1. Add Book");
        System.out.println("2. Borrow Book");
        System.out.println("3. return Book");
        System.out.println("Search Book by Tittle");
        System.out.println("5. Show All Books");
        System.out.println("6. Exit");
        System.out.println("=======================");

    }

    private static void addBookMenu(){
        System.out.println("Add Book Type: ");
        System.out.println("1. EBook");
        System.out.println("2. Printed Book");
        System.out.println("Enter Choice");

        int choice = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Book ID: ");
        int bookID = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Title: ");
        String title = scan.nextLine();

        System.out.println("Enter Author");
        String author = scan.nextLine();

        System.out.println("Enter Category: ");
        String category = scan.nextLine();

        Book book = null;

        if(choice == 1){
            System.out.println("Enter File Size(MB): ");
            int fileSize = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter URL");
            String bookURL = scan.nextLine();

            book = new EBook(bookID,title,author,category,fileSize,bookURL);
        }else if(choice == 2){
            System.out.println("Enter Number of pages: ");
            int pages = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter Rack Number: ");
            int rackNumber = scan.nextInt();
            scan.nextLine();

            book = new PrintedBook(bookID,title,author,category,pages,rackNumber);

        }else{
            System.out.println("Invalid Type. Returning to Menu");
            return;
        }
        library.addBook(book);
    }



}
