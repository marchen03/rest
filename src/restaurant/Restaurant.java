package restaurant;
import menu.Menu;
import main.Order;

public class Restaurant {

    private final RegisteredRests restaurantName;
    private final Menu menu;
    private double priceMultiplier = 1; // No change
    private boolean happyHour = false;

    public Restaurant(RegisteredRests restaurantName, Menu menu) {
        this.restaurantName = restaurantName;
        this.menu = menu;
    }


    public Menu getCurrentMenu(Order order) {
        switch(restaurantName) {
            // Custom price calculations for each restaurant
            case A:
                if(order.getDiningStatus())
                    priceMultiplier = 1.1; // 10% more expensive if eaten in
                break;
            case B:
                if(order.getHour() == 10)
                    priceMultiplier = 0.95; // 5% discount for orders placed between 10:00-11:00
                break;
            case C:
                if(order.getDiningStatus())
                    priceMultiplier = 1.05; // 5% more expensive if eaten in
                if(order.getHour() == 16 || order.getHour() == 17)
                    happyHour = true; // TODO
                break;
        }
        




        // 1. do the copy of the initial menu
        // modify the prices
        return this.menu;
    }


    //abstract double computePrice(int time,);
}
