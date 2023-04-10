package ru.netology.HomeWork9;

public class Main {

    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (999)-999-99-99";
        post.subscription = true;

        post.birthday = new FormatDate();
        post.birthday.day = 02;
        post.birthday.month = 12;
        post.birthday.year = 1964;
    }
}
