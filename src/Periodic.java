public class Periodic extends BibliographicItem{
    private String periodicity; //semana, mensal,trimestral
    private int size;

    public Periodic(String periodicity, int size, String title, String code, int yearOfPublication) {
        super.setCode(title,code,yearOfPublication);
        this.periodicity = periodicity;
        this.size = size;
    }

    //Perioducity
    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    //Size
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        public String toString() {
            return "Periodic:" +getTitle() + ", Periodicity: " + periodicity+ ", Size: " + size  + "Year:" + getYearOfPublication() + ", Title: " + getTitle() + ", Code: " + getCode();
        }
    }
    //Validando periocidade e volume
    public void ValidateItemPeriodic(String periodicity, int size ) {
        return periodicity != null;
        return size > 0;
    }

}