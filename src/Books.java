public class Books extends BibliographicItem {
    private String author;
    private String isbn;

    public Books(String author, String isbn,String title, String code, int yearOfPublication){
        super(title, code, yearOfPublication);
        this.author = author;
        this.isbn = isbn;
    }

    public void Validate_fields() {
        this.author = author;
        this.isbn = isbn;
    }

    //Author
    public String getAuthor() {//get
        return author;
    }


    //Isbn
    public String getIsbn() {//get
        return isbn;
    }

    @Override
    public String toString() {
        return "Books:" +getTitle() + ", Author: " + author + ", ISBN: " + isbn + "Year:" + getYearOfPublication() + ", Title: " + getTitle() + ", Code: " + getCode();
    }
    //Validando Autor e ISBN
    public Boolean ValidateItemBooks(String author, String isbn) {
        if(!ValidateBibliographicItem()){
            return false;
        }

        if(author != null) {
            return false;
        }

        if(isbn != null || isbn.length() < 10 && isbn.length() > 13) {}
        return false;
    }
        return true;
}
