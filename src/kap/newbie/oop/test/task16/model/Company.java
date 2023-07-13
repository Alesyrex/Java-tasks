package kap.newbie.oop.test.task16.model;

/**
 * @author Alexandr Korovkin
 */
public final class Company {
    private final String model;
    private final String series;
    private final int issueYear;

    public Company(String model, String series, int issueYear){
        this.model = model;
        this.series = series;
        this.issueYear = issueYear;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getIssueYear() {
        return issueYear;
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (series != null ? series.hashCode() : 0);
        return 31 * result + issueYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!getClass().equals((obj.getClass()))){
            return false;
        }
        Company company = (Company) obj;
        return this.model.equals(company.model) && this.series.equals(company.series)
                && this.issueYear == company.issueYear;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' + ", series='" + series + '\'' + ", issueYear=" + issueYear;
    }
}
