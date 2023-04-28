package com.skypro.course1.hw13_methods_of_objects_test;

import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    protected String author1;
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

    @Override
    public String toString() {
        return "Книга '" + name + "', " + publicationYear + " год публикации, " + author.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }
}