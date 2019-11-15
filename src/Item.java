public class Item {

    private String Name;
    private int itemC;

    public Item(int x,String y){

        this.itemC = x;
        this.Name = y;
    }

     void display(){

        System.out.println("Item code: " + itemC + " Name: " + Name);
    }




}
