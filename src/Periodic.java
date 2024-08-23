public class Periodic extends BibliographicItem {
    private String periodicity; // semana, mensal, trimestral
    private int size;

    public Periodic(String periodicity, int size, String title, String code, int yearOfPublication) {
        super(title, code, yearOfPublication);
        this.periodicity = periodicity;
        this.size = size;
    }

    // Periodicidade
    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    // Volume
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Periodic: " + getTitle() + ", Periodicity: " + periodicity + ", Size: " + size
                + ", Year: " + getYearOfPublication() + ", Code: " + getCode();
    }

    // Valida periocidade e volume
    public boolean validateItemPeriodic() {
        return periodicity != null && !periodicity.isEmpty() && size > 0;
    }
}
