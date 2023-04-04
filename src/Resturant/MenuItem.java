package Resturant;

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

    //getters & setters

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public boolean isNew() { return isNew; }

    public void setIsNew(boolean isNew) { this.isNew = isNew; }

}
