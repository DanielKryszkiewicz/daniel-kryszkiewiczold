package com.kodilla.exception.test;

public class ExceptionHandling extends SecondChallenge {

    public void runExceptionhandling() {

        SecondChallenge check = new SecondChallenge();

        try {

            System.out.println(check.probablyIWillThrowException(2,1));

        } catch (Exception e){

            System.out.println(e);

        } finally {
            System.out.println("Finish");
        }
    }
}


