package jwd.java.introduction.task.tenth.book.fundomentals.entity.comparator;

import jwd.java.introduction.task.tenth.book.fundomentals.entity.Book;
import jwd.java.introduction.task.tenth.book.fundomentals.util.ObjectUtils;

import java.util.Comparator;

public class BookAuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book firstBook, Book secondBook) {
        int authorComparisonResult = ObjectUtils.compare(firstBook.getAuthor(), secondBook.getAuthor());
        return authorComparisonResult == 0 ? ObjectUtils.compare(firstBook.getTitle(), secondBook.getTitle())
                : authorComparisonResult;
    }
}