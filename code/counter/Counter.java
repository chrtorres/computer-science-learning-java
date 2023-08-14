package counter;

public class Counter {
    private int count; // integer instance variable
    
    public Counter(){} //default constructor (count is 0)
    
    // an alternate constructor
    public Counter(int initial){ 
        count = initial;
    }
    
    // an accessor method
    public int getCount(){ 
        return count;
    }
    
    // an update method
    public void increment(){
        count++;
    }

    // an update method
    public void increment(int delta){
        count += delta;
    }

    // an update method
    public void reset(){
        count = 0;
    }
    
}
