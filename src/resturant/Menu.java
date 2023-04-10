package resturant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public Menu() { this.lastUpdated = new Date(); }

    //getters & setters

    public ArrayList<MenuItem> getMenuItems() { return menuItems; }

    public void setMenuItems(ArrayList<MenuItem> menuItems) { this.menuItems = menuItems; }

    public Date getLastUpdated() { return lastUpdated; }

    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }





    //other methods
    public void addMenuItem(MenuItem item) {
        //add to list of menu items
        this.menuItems.add(item);
        //update lastUpdated
        this.lastUpdated = new Date(); //using new Date sets whatever time/date it is at moment
    }






    public void removeMenuItem(MenuItem item) {
        //remove the item from the list
        this.menuItems.remove(item);
        //update lastUpdated property (class variable)
        this.lastUpdated = new Date(); //using new Date sets whatever time/date it is at moment
    }

    @Override
    public String toString() {
        String returnString = "";
        //for menuItem in listOfMenuItems
        for (MenuItem item : this.menuItems) {
            //menuItem.printOutMenuItem();
            returnString += item.toString() + "\n\n";
        }
        return returnString;
    }


}
