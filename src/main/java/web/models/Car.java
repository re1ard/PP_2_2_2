package web.models;

public class Car {
    private String name;
    private String series;
    private String gov_number;

    public Car(String name, String series, String gov_number) {
        this.name = name;
        this.series = series;
        this.gov_number = gov_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getGov_number() {
        return gov_number;
    }

    public void setGov_number(String gov_number) {
        this.gov_number = gov_number;
    }

    @Override
    public String toString(){
        return String.format("Model: %s | Series: %s | Gov: %s", name, series, gov_number);
    }
}
