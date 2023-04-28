package com.skypro.course1.hw12_objects_and_classes;

public class StartApp {
    public static void main(String[] args) {
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
    }
}