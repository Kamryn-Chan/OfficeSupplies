
/**
 * Class Food creates food objects that are put in a Microwave object.
 *
 * @Sharon Chou & Kamryn Chan
 * @2023-01-30
 */
public class Food
{
    private String name;
    private int time;

    /**
     * Constructor for objects of class Food
     */
    public Food(String name, int time)
    {
        this.name = name;
        this.time = time;
    }

    /**
     * Gets the time this food needs to be heated.
     *
     * @return    time needed
     */
    public int getTime()
    {
       return time;
    }
    
    /**
     * Gets the name of the food
     * 
     * @return name of the food
     */
    public String getName()
    {
        return name;
    }
}
