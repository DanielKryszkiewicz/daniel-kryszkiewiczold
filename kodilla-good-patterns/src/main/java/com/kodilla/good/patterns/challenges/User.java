package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Objects;

public final class User {

    private final String user;
    private final String userName;
    private final String userSurname;

    public User(String user, String userName, String userSurname){
        this.user = user;
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getUser() {
        return user;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user1 = (User) o;
        return Objects.equals(user, user1.user) &&
                Objects.equals(userName, user1.userName) &&
                Objects.equals(userSurname, user1.userSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, userName, userSurname);
    }
}
