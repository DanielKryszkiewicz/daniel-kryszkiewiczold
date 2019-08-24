package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {

    private int userID;
    private String userName;
    private char sex;
    private LocalDate birthDay;
    private int posts;

    ForumUser(int userID, String userName, char sex, LocalDate birthDay,int posts){
        this.sex = sex;
        this.userID = userID;
        this.posts = posts;
        this.userName = userName;
        this.birthDay = birthDay;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }



    public int getPosts() {
        return posts;
    }
    public int getAge(){
        return Period.between(birthDay, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", posts=" + posts +
                '}';
    }
}
