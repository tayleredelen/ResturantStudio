package resturant;

public class Resturant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Salad", "Delicious greens", 7.50, "Healthy", true);
        MenuItem item2 = new MenuItem("Salad", "Delicious greens", 7.50, "Healthy", true);
        MenuItem item3 = new MenuItem("Cake", "Delicious desserts", 5.50, "Treat", true);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);

        myMenu.removeMenuItem(item3);

//        //test toString method
//        System.out.println(item1.toString()); //prints menu info for item1
//
//        //test equals method
//        System.out.println(item1.equals(item2)); //true
//        System.out.println(item1.equals(item3)); //false

        //print entire menu
        System.out.println(myMenu.toString());

//        //print individual item
//        System.out.println(item1.toString());
//
        //delete item, then reprint it

        System.out.println();

    }
}
