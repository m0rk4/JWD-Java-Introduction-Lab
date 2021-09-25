package jwd.java.introduction.task.tenth.book.fundomentals.entity;

public class ProgrammerBook extends Book {
    private final String language;
    private final int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        ProgrammerBook book = (ProgrammerBook) o;
        boolean isLanguageEqual = (language == book.language) || (language != null && language.equals(book.language));
        return level == book.level && isLanguageEqual;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + super.hashCode();
        result = 31 * result + (language == null ? 0 : language.hashCode());
        result = 31 * result + Integer.hashCode(level);
        return result;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language='" + language + '\'' +
                ", level=" + level +
                "} " + super.toString();
    }
}
