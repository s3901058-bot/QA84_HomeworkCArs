import java.util.Objects;

public class Cars implements Comparable<Cars>{
    private String model;
    private int year;
    private int regNumber;


    public Cars(String model, int year, int regNumber) {
        this.model = model;
        this.year = year;
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    @Override

    public int compareTo(Cars o) {
        return Integer.compare(this.regNumber, o.regNumber);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return year == cars.year && regNumber == cars.regNumber && Objects.equals(model, cars.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, regNumber);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", regNumber=" + regNumber +
                '}';
    }
}
