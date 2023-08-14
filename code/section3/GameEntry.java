package section3;

/* Each GameEntry requires a name and score for an entry.
 * @param name 
 * @param score
 */
public class GameEntry {
    private String name;
    private int score;

// Constructor for a GameEntry object
    public GameEntry(String n, int s){
        this.name = n;
        this.score = s;
    }

// Retrieve name
    public String getName(){
        return this.name;
    }

// Retrieve score
    public int getScore(){
        return this.score;
    }

// toString() method to output String representation of an entry.
    public String toString(){
        return "(" + this.name + "," + this.score + ")";

    }


}
