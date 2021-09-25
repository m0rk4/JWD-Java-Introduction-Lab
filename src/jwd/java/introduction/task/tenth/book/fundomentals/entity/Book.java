package jwd.java.introduction.task.tenth.book.fundomentals.entity;

import jwd.java.introduction.task.tenth.book.fundomentals.util.ObjectUtils;

public class Book implements Comparable<Book>, Cloneable {
    private static int edition;
    private final String title;
    private final String author;
    private final int price;
    private final String isbn;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        boolean isTitleEqual = (title == book.title) || (title != null && title.equals(book.title));
        boolean isAuthorEqual = (author == book.author) || (author != null && author.equals(book.author));
        return price == book.price && isTitleEqual && isAuthorEqual;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (title == null ? 0 : title.hashCode());
        result = 31 * result + (author == null ? 0 : author.hashCode());
        result = 31 * result + Integer.hashCode(price);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Book o) {
        return ObjectUtils.compare(this.isbn, o.isbn);
    }
}
