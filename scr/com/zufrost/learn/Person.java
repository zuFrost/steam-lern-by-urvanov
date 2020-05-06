package com.zufrost.learn;

import java.time.LocalDate;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birtday;
    Sex gender;
    String emailAddress;
    int personCounter;


    public Person() {
        this.name = "Jon Dow " + personCounter;
        this.birtday = LocalDate.now();
        this.gender = Sex.MALE;
        this.emailAddress = "mail" + personCounter + "@mail.com";
        personCounter++;
    }

    public Person(String name, LocalDate birtday, Sex gender, String emailAddress) {
        this.name = name;
        this.birtday = birtday;
        this.gender = gender;
        this.emailAddress = emailAddress;
        personCounter++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirtday() {
        return birtday;
    }

    public void setBirtday(LocalDate birtday) {
        this.birtday = birtday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birtday=" + birtday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
