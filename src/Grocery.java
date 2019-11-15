public class Grocery extends Item {

    private String name;
    private int itemC;

    private double price;
    private double units;
    private double discount;
    private double UP;
    private double savings;
    private double sub;
    private double TA;
    private double FA;


    public Grocery(int x,String y,double a,double b,double c){

        super(x,y);
        itemC = x;
        name = y;
        price = a;
        units = b;
        discount = c;
        UP = price/units;
    }

    public void computeDiscount(){

        savings = price * (discount/100);
        sub = price - (price * (discount/100));

    }

    public void computeTax(){

        TA = sub * 0.00825;
    }

    public double computeTotalPrice(){

        FA = sub + TA;
        return FA;
    }

    public void displayGrocery(){

        System.out.println("Item Code: " + itemC);
        System.out.println("Name: " + name);
        System.out.println("Unit Price: " + UP);
        System.out.println("Units: " + units );
        System.out.println("Savings: " + savings);
        System.out.println("Subtotal " + sub);
        System.out.println("Tax Amount: " + TA);
        System.out.println("Price: " + FA + "\n");

    }


}
