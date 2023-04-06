package resturant;

import java.util.Objects;

public class MenuItem {
    //variables
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean isNew;

    //constructors

    public MenuItem(String name, String description, double price, String category, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    //methods


    //getters & setters

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public boolean isNew() { return isNew; } //removed get to pull isNew

    public void setIsNew(boolean isNew) { this.isNew = isNew; }

    //other methods
    @Override
    public String toString() {
        String returnString = "";
        returnString += "Item Name: " + this.name + "\n";
        returnString += "Description Name: " + this.description + "\n";
        returnString += "Item Price: " + this.price + "\n";
        returnString += "Item Category: " + this.category + "\n";
        returnString += "Item Is New? " + this.isNew + "\n";
        return returnString;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        //if object coming in is same memory address to instance reference return true
        if(!(obj instanceof MenuItem)) {
            return false;
        }

        MenuItem menuItem = (MenuItem) obj;
        //casts object into MenuItem

        if (menuItem.name.equals(this.name)
                //if itemName equals menuItem.itemName
                && menuItem.description.equals(this.description)
                //and itemDescription equals menuItem.itemDescription
                && Objects.equals(menuItem.price, this.price)
                //and itemPrice equals menuItem.itemPrice
                && menuItem.category.equals(this.category))
                //and itemCategory equals menuItem.itemCategory
        {
            return true;
        }
        //then return true
        else return false;
    }


}

