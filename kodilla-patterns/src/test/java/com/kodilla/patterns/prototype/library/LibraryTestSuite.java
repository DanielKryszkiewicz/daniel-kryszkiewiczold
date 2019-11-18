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
        Book book4 = new Book("Book4","Jankowski",LocalDate.of(1999,11,11));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Cloned Library");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("my Library - deep copy");
            } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            }

            //When
        library.removeBook(book4);


            //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);



    }
}
