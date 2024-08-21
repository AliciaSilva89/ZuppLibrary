public abstract class BibliographicItem {
    private String title;
    private String code;
    private int yearOfPublication;

    public BibliographicItem(String title, String code, int yearOfPublication) {
        this.title = title;
        this.code = code;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    // Valida os atributos da classe

    public boolean validateBibliographicItem() {
        // Verifica se o título e o código não são nulos
        if (title == null || title.isEmpty() || code == null || code.isEmpty()) {
            return false;
        }

        // Verifica o ano de publicação
        return yearOfPublication > 1000 && yearOfPublication <= 2024;
    }
}

