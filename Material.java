package NguyenLieu;

import java.time.LocalDate;

public abstract class Material {
    String id;
    String name;
    LocalDate manufacturingDate;
    int cost;

    public Material()
    {

    }
    public Material(String name, int cost, LocalDate manufacturingDate, String id) {
        this.name = name;
        this.cost = cost;
        this.manufacturingDate = manufacturingDate;
        this.id = id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getId()
    {
        return this.id;
    }

    public int getCost() {
        return this.cost;
    }

    public LocalDate getManufacturingDate() {
        return this.manufacturingDate;
    }

    public String getName() {
        return this.name;
    }
    abstract double getAmount();
    abstract LocalDate expiryDate();

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}
