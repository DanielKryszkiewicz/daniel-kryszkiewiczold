package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setBooks(Set<Book> books) {
        this.books = books;

    }

    public boolean addBook(Book book){
        return books.add(book);

    }

    public boolean removeBook(Book book){
        return books.remove(book);
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library) super.clone();

        clonedLibrary.setBooks(new HashSet<>());

        for (Book book : getBooks()) {
            clonedLibrary.addBook(new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate()));
        }
        return clonedLibrary;
    }


    @Override
    public String toString() {
        String s = "Books [" + name + "]\n";
        for(Book list : books) {
            s = s + list.toString() + "\n";
        }
        return s;
    }
}





