package main;

import restaurant.*;
import java.util.ArrayList;
import menu.*;

public class Order {
    
    private int hour;
    private boolean dineIn;
    private Restaurant restaurant;
    private ArrayList<MenuItem> order;
    private Menu currentMenu;


    public Order(int hour, boolean dineIn, Restaurant restaurant) {
        this.hour = hour;
        this.dineIn = dineIn;
        this.restaurant = restaurant;
        order = new ArrayList<MenuItem>();
        currentMenu = restaurant.getCurrentMenu(this);
    }


    public boolean getDiningStatus() {
        return this.dineIn;
    }


    public int getHour() {
        return hour;
    }


    public void addToOrder(MenuItem menuItem) {
        order.add(menuItem);
        // TODO: Check that menuItem is possible to order at designated restaurant


        // if(menuItem instanceof Drink)
        //     menuItem = (Drink) menuItem;
        // if(menuItem instanceof Dish)
        //     menuItem = (Dish) menuItem;

        // if(this.currentMenu.getDishes().contains(menuItem) || this.currentMenu.getDrinks().contains(menuItem))
        //     order.add((MenuItem) menuItem);
        // else
        //     throw new IllegalArgumentException("Not a menu item at this restaurant.");
    }


    public ArrayList<MenuItem> getOrder() {
        return this.order;
    }

    public double getTotal() {
        double total = 0;
        for(MenuItem menuItem : order) {
            total += menuItem.getPrice();
        }
        return total;
    }
}
