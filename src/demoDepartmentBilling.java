public class demoDepartmentBilling {

    public static void main(String[]args){


        Grocery a1 = new Grocery(11,"Bread",2,1.50,0);
        Grocery a2 = new Grocery(12,"Apple",6,0.75,1);

        Clothing b1 = new Clothing(21,"Jeans","Levis",35,1,0);
        Clothing b2 = new Clothing(22,"Dress Shirt","Izod",25,2,10);


        a1.computeDiscount();
        a1.computeTax();
        a1.computeTotalPrice();

        a2.computeDiscount();
        a2.computeTax();
        a2.computeTotalPrice();

        b1.computeDiscount();
        b1.computeTax();
        b1.computeTotalPrice();

        b2.computeDiscount();
        b2.computeTax();
        b2.computeTotalPrice();


        a1.displayGrocery();
        a2.displayGrocery();

        b1.displayClothing();
        b2.displayClothing();


        System.out.println("Total Bill Amount: " + (a1.computeTotalPrice() + a2.computeTotalPrice() + b1.computeTotalPrice() + b2.computeTotalPrice()));
    }


}
