/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors); // is a building
    // with...
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();

  }

  /**
   * Getter for boolean of hasDiningRoom
   * 
   * @return True or False
   */
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }

  /**
   * Getter for number of residents in house
   * 
   * @return the number of residents
   */
  public int nResidents() {
    return residents.size();
  }

  /**
   * Adds name to the residents list
   * 
   * @param name name of resident
   */
  public void moveIn(String name) {
    residents.add(name);
  }

  /**
   * Removes name from residents list
   * 
   * @param name name of resident
   * @return the name removed
   */
  public String moveOut(String name) { // return the name of the person who moved out
    residents.remove(name);
    return name;
  }

  /**
   * returns whether person is a resident
   * 
   * @param person name of resident
   * @return true or false
   */
  public boolean isResident(String person) {
    return residents.contains(name);
  }

  public String toString() {
    String desc = super.toString();
    desc = "RESIDENCE HALL: " + desc;
    if (hasDiningRoom == true) {
      desc += ". It has a dining room. ";
    }
    return desc;
  }

  public static void main(String[] args) {
    House myHouse = new House("Morrow", "3 Elm St", 4, false);
    System.out.println(myHouse);
  }

}