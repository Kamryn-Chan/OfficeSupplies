
/**
 * The Pen Class is an abstraction of a pen.
 *
 * @author Sharon Chou & Kamryn Chan
 * @version 2023-01-30
 */
public class Pen
{
   private boolean capped;
   private int wordsLeft;
   
   /**
    * Constructor for Pen Class
    */
   public Pen()
   {
       wordsLeft = 50; //it's a really crappy pen
       capped = true;
   }
   
   /**
    * Get words left
    * 
    * @return words left
    */
   public int getWordsLeft()
   {
       return wordsLeft;
   }
   
   /**
    * Checks if pen is capped or not.
    * 
    * @return capped status
    */
   public boolean getCapped()
   {
       if (!capped)
       {
           wordsLeft = wordsLeft - 5;
       }
       return capped;
   }
   
   /**
    * Caps pen
    */
   public void cap()
   {
       capped = true;
   }
   
   /**
    * Uncaps pen.
    */
   public void uncap()
   {
       capped = false;
   }
   
   /**
    * Writes words with the pen
    * 
    * @param number of words to be written
    * @return either an error message if capped or success message and reminder if uncapped
    */
   public String writeWords(int words)
   {
       if (!capped)
       {
         wordsLeft = wordsLeft - words;  
         return "Look at you-- the next Shakespeare! Remember to cap your pen so it doesn't dry out!";
       }
       else
       {
           return "Error-- uncap your pen!";
       }
   }
   
   /**
    * Extends the life of the pen by a bit.
    */
   public void scribble()
   {
       wordsLeft += 5;
   }
}
