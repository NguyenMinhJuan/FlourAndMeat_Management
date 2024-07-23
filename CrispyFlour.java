package NguyenLieu;

import java.time.LocalDate;

public class CrispyFlour extends Material implements DisCount {
    int quantity;

    public CrispyFlour(String name, int cost, LocalDate manufacturingDate, String id, int quantity) {
        super(name, cost, manufacturingDate, id);
        this.quantity = quantity;
    }

    @Override
    public double disCount() {
        return getAmount()*5/10;
    }

    @Override
    public double getRealMoney() {
        return getAmount()-disCount();
    }

    @Override
    double getAmount() {
        return this.quantity*this.cost;
    }

    @Override
    LocalDate expiryDate() {
        LocalDate temp=this.getManufacturingDate();
        int year=temp.getYear()+1;
        LocalDate newDate= LocalDate.of(year, temp.getMonth(), temp.getDayOfMonth());
        return newDate;
    }

    @Override
    public String toString() {
        return super.toString()+ "quantity=" + quantity ;
    }
}
