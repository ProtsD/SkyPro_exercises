package com.skypro.course1.hw12_objects_and_classes;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public static Book[] library = new Book[0];

    public static void addToLibrary(Book book) {
        Book[] libraryPlusOne = new Book[library.length + 1];
        for (int bookNumber = 0; bookNumber < libraryPlusOne.length; bookNumber++) {

            if (bookNumber <= library.length - 1) {
                libraryPlusOne[bookNumber] = library[bookNumber];
            }
            if (bookNumber == libraryPlusOne.length - 1) {
                libraryPlusOne[libraryPlusOne.length - 1] = book;
            }
            library = libraryPlusOne;
        }
    }
}