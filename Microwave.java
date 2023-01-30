
/**
 *Class Microwave models a microwave that is so high tech it can recognize the food inputted and set the time accordingly.
 *
 * @Sharon Chou & Kamryn Chan
 * @2023-01-30
 */
public class Microwave
{
    // instance variables - replace the example below with your own
    private int timeSet;
    private Food content;

    /**
     * Constructor for objects of class Microwave
     */
    public Microwave()
    {
        timeSet = 0;
    }
    
    /**
     * Sets the content of the microwave
     * 
     * @param Food object
     */
    public void putIn(Food thing)
    {
        content = thing;
    }
    
    /**
     * Starts time, which is set based on what food is in the microwave, displays the countdown, and tells the user when the microwave is done.
     * 
     */
    public void microwave()
    {
        
    }
}
