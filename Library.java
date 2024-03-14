/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building{

  private Hashtable<String, Boolean> collection;
  
  
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors); //is a building
    //with...
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }
  
  public void addTitle(String title){
    collection.put(title, true);
  }
  public String removeTitle(String title){ // return the title that we removed
    collection.remove(title);
    return title + " is removed from library.";
  }
  
  public void checkOut(String title){
    collection.replace(title, true, false);
  }
  public void returnBook(String title){
    collection.replace(title, false, true);
  }
  public boolean containsTitle(String title){ // returns true if the title appears as a key in the Libary's collection, false otherwise
    return collection.containsKey(title);
  }
  public boolean isAvailable(String title){ // returns true if the title is currently available, false otherwise
    return collection.get(title).equals(true);
  }

  public void printCollection(){ // prints out the entire collection in an easy-to-read way (including checkout status)
    System.out.println("List of books in collection:");
    collection.forEach((key, value) -> {
      if (isAvailable(key)){
        String status = "In";
        System.out.println("Title: " + key + "\t Availability: " + status);
      }
      else{
        String status = "Out";
        System.out.println("Title: " + key + "\t Availability: " + status);
      }
    });
    
    
  } 
  public static void main(String[] args) {
   Library mylibrary = new Library("Neilson Libarary", "123 W ST", 4);
   mylibrary.addTitle("Clear and Muddy Loss of Love");
   mylibrary.addTitle("Grandmaster of Demonic Cultivation");
   mylibrary.printCollection();
   mylibrary.checkOut("Clear and Muddy Loss of Love");
   mylibrary.printCollection();
  }
  
}