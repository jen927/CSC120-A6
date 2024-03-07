/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building{

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors); // is a building
    //with...
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
    
  }
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  }
  public int nResidents(){
    return residents.size();
  }
  public void moveIn(String name){
    residents.add(name);
  }
  public String moveOut(String name){ // return the name of the person who moved out
    residents.remove(name);
    return name;
  }
  public boolean isResident(String person){
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