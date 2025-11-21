package service;

import model.Book;
import model.EBook;
import model.PrintedBook;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    public void displayBookDetails(Book b){
        b.toString();

        if(b instanceof EBook){
            EBook eb = (EBook) b;
            eb.toString();
        }else if(b instanceof PrintedBook){
            PrintedBook pb = (PrintedBook) b;
            pb.toString();
        }
    }

    public void addBook(Book b){
        books.add(b);
        System.out.println("Book added: " + b.getTittle());
    }

    public void removeBook(Book b){
        books.remove(b);
        System.out.println("Book removed Successfully");
    }

    public Book searchByTittle(String tittle){
        for(Book b : books){
            if(b.getTittle().equals(tittle)){
                return b;
            }
        }
        return null;
    }

    public  void showBook(){
        if(books.isEmpty()){
            System.out.println("There are no books in library");
        }else {
            for(Book b:books){
                System.out.println(b);
            }
        }
    }

    public Book findById(int id){
        if(books.isEmpty()){
            return null;
        }else{
            for(Book b : books){
                if(b.getBookId() == id){
                    return b;
                }
            }
        }
        return null;
    }


}
