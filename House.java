import java.util.ArrayList;

public class House extends Building implements HouseRequirements{

  private ArrayList<Student> residents;
  private boolean hasDiningRoom;
  private boolean hasElevator;
  
  /***
   * Full constructor for building a house
   * @param hasDiningRoom whether the house has a dining room
   * @param hasElevator whether the house has an elevator
   * @param name the name of the house
   * @param address the house address
   * @param nFloors number of floors in the house
   */
  public House(boolean hasDiningRoom, boolean hasElevator, String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.residents = new ArrayList<Student>();
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator;
    System.out.println("You have built a house: 🏠");
  }

  /***
   * Partial constructor with only basic building details 
   * @param name the name of the house
   * @param address the house address
   * @param nFloors number of floors in the house
   */
  public House(String name, String address, int nFloors) {
    this(false, true, name, address, nFloors);
  }

  /* Constructor with no parameters */
  public House() {
    super();
    this.hasDiningRoom = false;
    this.hasElevator = true;
  }

  /***
   * Method to retrieve hasDiningRoom attribute
   * @return whether the house has a dining room or not
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /***
   * Method to retrieve hasElevator attribute
   * @return whether the house has an elevator or not
   */
  public boolean hasElevator() {
    return this.hasElevator;
  }

  /***
   * Method to retrieve the number of residents in the house
   * @return number of residents in the house
   */
  public int nResidents() {
    return this.residents.size();
  }

  /***
   * Method to move a resident into the house (overloaded)
   * @param s student to move into the house
   */
  public void moveIn(Student s) {
    if (this.residents.contains(s)) {
      throw new RuntimeException("Student already lives in this house!");
    }
    this.residents.add(s);
  }

  /* Method to move resident into the house with no parameters*/
  public void moveIn() {
    Student newStudent = new Student("Jane Doe", "99XXXXXXX", 2028);
    moveIn(newStudent);
  }

  /***
   * Method to move a resident out of the house
   * @return the student who is moving out
   */
  public Student moveOut(Student s) {
    if (!this.residents.contains(s)) {
      throw new RuntimeException("Can't move out a student that doesn't live here!");
    }
    this.residents.remove(s);
    return s;
  }

  /***
   * Method to check if a student lives in the house
   * @return whether the student is on the list of house residents
   */
  public boolean isResident(Student s) {
    if (this.residents.contains(s)) {
      return true;
    } else {
      return false;
    }
  }

  /***
   * Method to show available building options
   */
  public void showOptions() {
    super.showOptions();
    System.out.println(" + hasDiningRoom() \n + hasElevator() \n + nResidents() \n + isResident(s) \n + moveIn(s) \n + moveOut(s)");
  }

  /***
   * Method to travel to different floor
   */
  public void goToFloor(int floorNum) {
    if (this.hasElevator == true) {
      super.goToFloor(floorNum);
    } else {
      throw new RuntimeException("This house doesn't have an elevator! You'll have to move floor by floor.");
    }
  }
}