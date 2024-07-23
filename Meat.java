package NguyenLieu;

import java.time.LocalDate;

public class Meat extends Material implements DisCount {
    double weight;

    public Meat(String name, int cost, LocalDate manufacturingDate, String id, double weight) {
        super(name, cost, manufacturingDate, id);
        this.weight = weight;
    }

    @Override
    public double disCount() {
        return getAmount()*10/100;
    }

    @Override
    public double getRealMoney() {
        return getAmount()-disCount();
    }

    @Override
    double getAmount() {
        return this.cost*this.weight;
    }
    LocalDate expiryDate() {
        LocalDate temp=this.manufacturingDate;
        int day=temp.getDayOfMonth()+7;
        LocalDate newDate=LocalDate.of(temp.getYear(), temp.getMonth(), day);
        return newDate;
    }

    @Override
    public String toString() {
        return super.toString()+
                "weight=" + weight ;
    }
}
