package com.kodilla.game;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class SpeedTest {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        Book firstBook = null;
        Book lastBook = null;

        for (int n = 0; n < 1000000; n++) {
            Book book = new Book("author" + n, "title" + n);
            if (n == 0) {
                firstBook = book;
            }
            lastBook = book;
            books.add(book);
        }


            long begin = System.nanoTime();
            books.get(0);
            long end = System.nanoTime();
            System.out.println("Searching first book took: " + (end - begin) + "ms");

            begin = System.nanoTime();
            books.get(books.size() - 1);
            end = System.nanoTime();
            System.out.println("Searching last book took: " + (end - begin) + "ms");


            begin = System.nanoTime();
            books.remove(firstBook);
            end = System.nanoTime();
            System.out.println("Deleting first book took: " + (end - begin) + "ms");


            begin = System.nanoTime();
            books.add(0, new Book("author", "title"));
            end = System.nanoTime();
            System.out.println("Adding book in the beginning of collection took: " + (end - begin) + "ns");


            begin = System.nanoTime();
            books.add(new Book("author", "title"));
            end = System.nanoTime();
            System.out.println("Adding book in the end of collection took: " + (end - begin) + "ns");


            HashMap<Reader, Book> booksMap = new HashMap <Reader, Book>();
            Reader firstReader = null;

            for(int m = 0; m < 800000; m++){
            Reader reader = new Reader("reader"+ m);
            Book bookz = new Book("author" + m, "title" + m);

            if(m == 0) {
                firstReader = reader;
            }

            booksMap.put(firstReader, bookz);
        }


        begin = System.nanoTime();
        booksMap.get(firstReader);
        end = System.nanoTime();
        System.out.println("Key searching took: " + (end - begin) + "ms");


        begin = System.nanoTime();
        booksMap.put(new Reader("reader"), new Book("author", "title"));
        end = System.nanoTime();
        System.out.println("Adding element to map took: " + (end - begin) + "ms");


        begin = System.nanoTime();
        booksMap.remove(firstReader);
        end = System.nanoTime();
        System.out.println("Deleting element from map took: " + (end - begin) + "ms");
    }



}


