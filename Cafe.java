/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    public Cafe(String name, String address, int nFloors,
    int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    public void sellCoffee(int size, int nSugarPacketsUsed, int nCreamsUsed){
       nCoffeeOunces -= size;
       nSugarPackets -= nSugarPacketsUsed;
       nCreams -= nCreamsUsed;
       nCups -= 1;
       if ((nCoffeeOunces <= 0) || (nSugarPackets <= 0) || (nCreams <= 0) || (nCups <= 0)) {
        restock(100,50 , 200, 10);
       }

    }
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        nCoffeeOunces += nCoffeeOunces;
        nSugarPackets += nSugarPackets;
        nCreams += nCreams;
        nCups += nCups;
    }

    public String toString() {
        String desc = super.toString();
        desc = "CAFE: " + desc;
        return desc;
        }
    
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Campus Center CAFE",
         "123 W St", 1, 100, 20, 50, 10);
        System.out.println(myCafe.toString());
        myCafe.sellCoffee(10, 1, 5);
    }
    
}
