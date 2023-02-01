
/**
 *Class Microwave models a microwave that is so high tech it can recognize the food inputted and set the time accordingly.
 *
 * @Sharon Chou & Kamryn Chan
 * @2023-01-30
 */
public class Microwave
{
    private int timeSet;
    private String content;

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
        content = thing.getName();
        timeSet = thing.getTime();
    }
    
    /**
     * Starts time, which is set based on what food is in the microwave, displays the countdown, and tells the user when the microwave is done.
     */
    public void microwave()
    {
        int min = (int) timeSet/60;
        int secRemainder = (int)timeSet%60;
        for (int i = min; i >= 0; i--)
        {
            int sec;
            if (i == min) //if we're on the first minute
            {
                sec = secRemainder;
            }
            else
            {
                sec = 59;
            }
            for (int j = sec; j >= 0; j--)
            {
                String display = "";
                display += i + ":";
                if (j < 10)
                {
                     display += "0" + j;
                }
                else
                {
                     display += j;
                }
                clearConsole();
                System.out.println(display); 
                sleep(990);
            }
        }
        System.out.println("Ding ding ding! Your " + content + " is ready!");
    }
    
     /**
 * The clearConsole method attemps to clear the Terminal so that
 * successive generations of the board can be displayed. The ANSI
 * escape sequence printed here only works in Terminals that support
 * them. BlueJ doesn't, but if you run this code in a regular 
 * Terminal window, it might work!
 */
private static void clearConsole()
{
    try {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    catch (Exception exception)
    {
        System.out.println("Error");
        //  Handle exception.
    }
}

/**
 * Pauses the program for a number of milliseconds.
 * 
 * @param number of milliseconds
 */
public static void sleep(int milliseconds)
{
    try
    {
        Thread.sleep(milliseconds);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
}
}
