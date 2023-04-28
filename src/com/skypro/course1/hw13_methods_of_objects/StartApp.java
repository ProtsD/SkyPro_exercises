package com.skypro.course1.hw13_methods_of_objects;

public class StartApp {
    public static void main(String[] args) {
        /////////////////// Homework 12 ///////////////////
        Book book0 = new Book("Война и мир", new Author("Лев", "Толстой"), 2021);
        Book book1 = new Book("Онегин", new Author("Александр", "Пушкин"), 2019);
        Book.addToLibrary(book0);
        Book.addToLibrary(book1);
        Author author0 = new Author("Владимир", "Маяковский");
        Author author1 = new Author("Федор", "Достоевский");

        System.out.println(book0.getName() +
                ", " + book0.getAuthor().getFirstName() +
                " " + book0.getAuthor().getSecondName() +
                ", " + book0.getPublicationYear());

        System.out.println(Book.library[0].getName() +
                ", " + Book.library[0].getAuthor().getFirstName() +
                " " + Book.library[0].getAuthor().getSecondName() +
                ", " + Book.library[0].getPublicationYear());

        System.out.println(book1.getName() +
                ", " + book1.getAuthor().getFirstName() +
                " " + book1.getAuthor().getSecondName() +
                ", " + book1.getPublicationYear());

        System.out.println(Book.library[1].getName() +
                ", " + Book.library[1].getAuthor().getFirstName() +
                " " + Book.library[1].getAuthor().getSecondName() +
                ", " + Book.library[1].getPublicationYear());

        System.out.println(author0.getFirstName() + " " + author0.getSecondName());
        System.out.println(author1.getFirstName() + " " + author1.getSecondName());

        book0.setPublicationYear(2013);
        System.out.println(book0.getName() +
                ", " + book0.getAuthor().getFirstName() +
                " " + book0.getAuthor().getSecondName() +
                ", " + book0.getPublicationYear());

        /////////////////// Homework 13 ///////////////////
        System.out.printf("Print book.toString:      %s\n", book0.toString());
        System.out.printf("Print book.toString:      %s\n", book1.toString());
        System.out.printf("Print author.toString:      %s\n", author0.toString());
        System.out.printf("Print author.toString:      %s\n", author1.toString());

        Book book2 = new Book("Онегин", new Author("Александр", "Пушкин"), 2019);
        Book book3 = new Book("Анегин", new Author("Александр", "Пушкин"), 2019);
        Book book4 = new Book("Онегин", new Author("Александр", "Пушкин"), 2019);
        System.out.println("book2==book3 (Онегин == Анегин): " + book2.equals(book3) +
                "\nbook2==book4 (Онегин == Онегин): " + book2.equals(book4));

        Author author2 = new Author("Владимир", "Маяковский");
        Author author3 = new Author("ладимир", "Маяковский");
        Author author4 = new Author("Владимир", "Маяковский");
        System.out.println("author2==author3 (Владимир == ладимир): " + author2.equals(author3) +
                "\nauthor2==author4 (Владимир == Владимир): " + author2.equals(author4));
    }
}