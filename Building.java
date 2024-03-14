public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    public Building(String name, String address, int nFloors) {
        if (name != null) {
            this.name = name;
        }
        if (address != null) {
            this.address = address;
        }
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Getter for name
     * 
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for address
     * 
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Getter for floor numbers
     * 
     * @return the number of floors
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Forms sentence describing building
     * 
     * @return the sentence
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
