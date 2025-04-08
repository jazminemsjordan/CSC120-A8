import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        Student me = new Student("Jazmine Jordan", "991471516", 2028);

        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));

        /*Constructors for special buildings (with house overloaded constructor) */
        House capenHouse = new House(false, false, "Capen House", "26 Prospect Street", 3);
        House emersonHouse = new House("Emerson House", "1 Paradise Road", 4);
        House ziskindHouse = new House(true, true, "Ziskind House", "79 Elm Street", 2);
        Library neilsonLibrary = new Library("Neilson Library", "7 Neilson Drive", 4);
        Library alumnaeGymnasium = new Library("Alumnae Gymnasium", "83 Green Street", 4);
        Cafe compassCafe = new Cafe("Compass Cafe", "7 Neilson Drive", 4);
        Cafe campusCenterCafe = new Cafe("Campus Center Cafe", "100 Elm Street", 1);

        /* Overloaded method demonstration */
        capenHouse.moveIn(me);
        emersonHouse.moveIn();
        neilsonLibrary.addTitle("Gone with the Wind by Margaret Mitchell");
        neilsonLibrary.addTitle();
        neilsonLibrary.containsTitle("Gone with the Wind by Margaret Mitchell");
        neilsonLibrary.containsTitle();
        compassCafe.sellCoffee(12, 2, 2);
        compassCafe.sellCoffee();
        
        /* Overloaded restock method is private*/
        /* buying a too large coffee for the inventory will trigger restock() */ 
        /* new method "ask to restock" runs for an expected number of customers and therefore cups; restock(nCups) */
        campusCenterCafe.sellCoffee(72, 6, 6);
        campusCenterCafe.askToRestock(4);

        /* Add new buildings to Campus Map */
        myMap.addBuilding(capenHouse);
        myMap.addBuilding(emersonHouse);
        myMap.addBuilding(ziskindHouse);
        myMap.addBuilding(neilsonLibrary);
        myMap.addBuilding(alumnaeGymnasium);
        myMap.addBuilding(compassCafe);
        myMap.addBuilding(campusCenterCafe);
        myMap.addBuilding(new Building("Smith College Museum of Art", "20 Elm Street", 4));
        myMap.addBuilding(new Building("Scott Gym", "102 Lower College Lane", 4));
        myMap.addBuilding(new Building("Sage Hall", "144 Green Street", 1));
        myMap.addBuilding(new Building("Seelye Hall", "2 Seelye Drive", 3));

        System.out.println(myMap);
        myMap.toString();    
    }
    
}
