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

    public boolean ValidateBibliographicItem(String title, String code, int yearOfPublication) {
        if(title == null || code == null ) {
            return false;
        }
        int year;
        try{
            year = Integer.parseInt(yearOfPublication);
        }catch (NumberFormatException e){
            return false;
        }
        return year > 1000 && year <= 2024;
    }
}
