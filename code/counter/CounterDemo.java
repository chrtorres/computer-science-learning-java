package counter;

public class CounterDemo {
    
    public static void main( String args[]){
        Counter c;                  // declares a variable; no counter yet constructed
        c = new Counter();          // constructs a counter; assigns its reference to c
        c.increment();              // increases its value by 1
        c.increment(3);       // increases its value by 3 more  
        int temp = c.getCount();    // will be 4
        c. reset();                 // value becomes 0
        Counter d = new Counter(5); //
        d.increment();              // increment by 1
        Counter e = d;              // assigns e to reference the same object as d
        temp = e.getCount();        // will be 6 (as e and d reference the same counter)
        e.increment(2);       // value of e (also known as d) becomes 8

        System.out.println(c.getCount() + "\t" + d.getCount() + "\t" + e.getCount() );

    }
}
