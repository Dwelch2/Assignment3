public class Clothing extends Item {

    private String brand;
    private int itemC;

    private double price;
    private double units;
    private double discount;
    private double tax;
    private double fin;
    private double UP;
    private double savings;
    private double sub;

    final double TP=8.5;


    public Clothing(int x, String y,String a,double b,double c,double d){

        super(x,y);
        itemC = x;
        brand = a;
        price = b;
        units = c;
        discount = d;
        UP = price/units;


    }


    public void computeDiscount(){


        savings = discount;
        discount = price * discount/100;
        sub = price - discount;

    }


    public void computeTax(){

        tax = TP * price;
    }

    public double computeTotalPrice(){

        fin = price + tax - discount;
        return fin;
    }

    public void displayClothing(){


        System.out.println("Item Code: " + itemC );
        System.out.println("Brand: " + brand);
        System.out.println("Unit Price: " + UP);
        System.out.println("Units: " + units);
        System.out.println("Subtotal: " + sub);
        System.out.println("Savings: " + savings);
        System.out.println("Tax Amount: " + tax);
        System.out.println("Final Price: " + fin + "\n");

    }}

