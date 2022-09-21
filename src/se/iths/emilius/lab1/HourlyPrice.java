package se.iths.emilius.lab1;

public class HourlyPrice {
    int price;
    int hour;

    @Override
    public String toString() {
        return "HourlyPrice{" +
                "price=" + price +
                ", hour=" + hour +
                '}';
    }

    public HourlyPrice(int price, int hour) {
        this.price = price;
        this.hour = hour;

    }
}
