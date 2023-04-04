package Resturant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    //constructors
    public Menu() { this.lastUpdated = new Date(); }

    //getters & setters

    public ArrayList<MenuItem> getMenuItems() { return menuItems; }

    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }

    public Date getLastUpdated() { return lastUpdated; }

    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }
}
