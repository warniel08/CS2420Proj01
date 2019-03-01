package nielwarnproj01;

/*
     This public abstract class will be inherited by student
     it will contain the name and id for a person and will also
     contain the toString() method to be used for each Student created
*/
public abstract class Person {
    // Common data fields for Person
    static int index_ = 10000;
    private String name_;

    private String id_;

    // Constructor to set base properties and initialize person
    public Person(String name) {
        name_ = name;

        // index is incremented each time a Person is instantiated, used for a unique ID
        index_++;

        // Initialize ID number
        id_ = setIDNum();
    }

    // setIDNum() method uses name and index to create a new unique ID
    public String setIDNum() {
        String firstTwoOfName = name_.substring(0, 2).toUpperCase();
        int uniqueID = index_;
        return firstTwoOfName + uniqueID;
    }

    // Method to return name
    public String getName() {
        return name_;
    }

    // Method to return ID
    public String getID() {
        return id_;
    }

    @Override // need to override the toString() method
    public String toString() {
        String formattedString = name_ + ", " + id_; // book asked for string to be returned this way
        return formattedString;
    }

    /* This overrides the equals() method to compare two objects to see if they
        are equal based on their ID numbers
    */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person p = (Person)obj;
        return p.id_ == id_;
    }
}
