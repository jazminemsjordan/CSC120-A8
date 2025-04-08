/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements{

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /***
     * Constructor for building a cafe
     * @param name the name of the cafe
     * @param address the cafe address
     * @param nFloors number of floors in the cafe
     */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 256;
        this.nSugarPackets = 64;
        this.nCreams = 64;
        this.nCups = 16;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Method to sell coffee and reduce inventory (overloaded)
     * @param size the integer size (in ounces) of the coffee
     * @param nSugarPackets the number of sugar packets in the coffee
     * @param nCreams the number of splashes of cream in the coffee
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (size <= this.nCoffeeOunces && nSugarPackets <= this.nSugarPackets && nCreams <= this.nCreams && this.nCups > 1) {
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
        } else {
            this.restock();
        }
    }
    
    /***
     * Method to sell coffee with no parameters and a default size
     */
    public void sellCoffee() {
        int size = 8;
        int nSugarPackets = 2;
        int nCreams = 2;
        this.sellCoffee(size, nSugarPackets, nCreams);
    }

    /**
     * Method to restock the cafe's inventory (overloaded)
     * @param nCoffeeOunces ounces of coffee to restock
     * @param nSugarPackets number of sugar packets to restock
     * @param nCreams number of splashes of cream to restock
     * @param nCups number of cups to restock
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    } 
    
    /**
     * Restock the cafe's inventory with only number of cups
     * @param nCups number of cups to restock
     */
    private void restock(int nCups) {
        nCoffeeOunces = nCups * 8;
        nSugarPackets = nCups * 2;
        nCreams = nCups * 2;
        this.restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
    }

    /**
     * Restock cafe inventory with no parameters
     */
    private void restock() {
        this.nCoffeeOunces = 64;
        this.nSugarPackets = 16;
        this.nCreams = 16;
        this.nCups = 8;
    }

    /**
     * Method to call private restock method
     * @param nCups number of cups to restock
     */
    public void askToRestock(int nCups) {
        restock(nCups);
    }

    /**
    * Method to show available building options
    */
    public void showOptions() {
        super.showOptions();
        System.out.println(" + sellCoffee() \n + askToRestock(nCups)");
    }

   /**
   * Method to travel to different floor
   */
    public void goToFloor(int floorNum) {
        if (this.activeFloor == -1) {
            throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
        } else {
            throw new RuntimeException("Only the first floor of the cafe is open to the public.");
        }
    }
}
