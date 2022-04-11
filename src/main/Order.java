package main;

public class Order {
    
    private int hour;
    private boolean dineIn;
    // total price + dishes ordered

    public Order(int hour, boolean dineIn) {
        this.hour = hour;
        this.dineIn = dineIn;
    }

    public boolean getDiningStatus() {
        return this.dineIn;
    }

    public int getHour() {
        return hour;
    }
}
