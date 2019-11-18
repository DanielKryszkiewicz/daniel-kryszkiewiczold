package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Library");
        Set<Book> books = new HashSet<>();
        Book book1 = new Book("Book1","Kowalski",LocalDate.of(2000,10,22));
        Book book2 = new Book("Book2","Januszewski",LocalDate.of(1999,10,11));
        Book book3 = new Book("Book3","Cebularski",LocalDate.of(1982,12,24));
        //When
        books.add(book1);
        books.add(book2);
        books.add(book3);
        //Then
        Assert.assertEquals(3,books.size(),1);
        System.out.println(books.size();



    }
}
