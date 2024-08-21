public class Books extends BibliographicItem {
    private String author;
    private String isbn;

    public Books(String author, String isbn, String title, String code, int yearOfPublication) {
        super(title, code, yearOfPublication);
        this.author = author;
        this.isbn = isbn;
    }

    // Valida campos e realiza qualquer lógica necessária
    public boolean validateFields() {
        return author != null && !author.isEmpty() && isbn != null && (isbn.length() >= 10 && isbn.length() <= 13);
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Books: " + getTitle() + ", Author: " + author + ", ISBN: " + isbn + ", Year: " + getYearOfPublication() + ", Code: " + getCode();
    }

    // Validando Autor e ISBN
    public boolean validateItemBooks() {
        if (!validateFields()) {
            return false;
        }
        return true;
    }
}
