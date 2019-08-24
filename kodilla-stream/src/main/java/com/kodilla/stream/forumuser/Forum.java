package com.kodilla.stream.forumuser;

import java.awt.print.Book;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public final class Forum {
    private final List<ForumUser> user = new ArrayList<>();

    public Forum() {
        user.add(new ForumUser(2, "Daniel", 'M', LocalDate.of(1991, 10, 21),21));
        user.add(new ForumUser(6, "Adam", 'M', LocalDate.of(1982, 11, 3),5));
        user.add(new ForumUser(7, "Magda", 'F', LocalDate.of(1987, 2, 13),354));
        user.add(new ForumUser(8, "Stefan", 'M', LocalDate.of(1966, 4, 4),789));
        user.add(new ForumUser(9, "Joanna", 'F', LocalDate.of(1975, 1, 1),103));
        user.add(new ForumUser(10, "Karolina", 'F', LocalDate.of(1999, 8, 22),222));
        user.add(new ForumUser(11, "Andrzej", 'M', LocalDate.of(1996, 9, 16),678));
        user.add(new ForumUser(12, "Mariusz", 'M', LocalDate.of(1995, 3, 23),211));
        user.add(new ForumUser(13, "Zygmunt", 'M', LocalDate.of(2002, 12, 19),993));
        user.add(new ForumUser(14, "Henryk", 'M', LocalDate.of(1991, 2, 1),133));
    }

    public List<ForumUser> getList() {
        return new  ArrayList<>(user);
    }
}












