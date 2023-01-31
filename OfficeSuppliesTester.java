
/**
 * Tester for each office supply.
 *
 * @author Sharon Chou & Kamryn Chan
 * @version 2023-01-30
 */
public class OfficeSuppliesTester
{
    public static void main (String[] args)
    {
        /**
         * System.out.println("Testing the pen!");
        Pen p = new Pen();
        System.out.println("Words left: " + p.getWordsLeft());
        System.out.println("Trying to write now...");
        p.writeWords(10);
        System.out.println("Uncapping the pen now so that I can actually write... Writing 20 words");
        p.uncap();
        p.writeWords(20);
        System.out.println("Words left: " + p.getWordsLeft() + ". Capping the pen.");
        p.cap();
        p.uncap();
        System.out.println("Uncapping to write 30 words!");
        p.writeWords(30);
        System.out.println("Words left: " + p.getWordsLeft() + " Better scribble a bit.");
        p.scribble();
        System.out.println("Words left: " + p.getWordsLeft());
        p.getCapped();
        System.out.println("You didn't cap your pen after writing! Minus 5 words. Words left: " + p.getWordsLeft());
        System.out.println("Trying to write even though I have no ink...");
        p.writeWords(10);
         */
        
        // Microwave has to be tested in terminal
        System.out.println("Testing the microwave!");
        Food popcorn = new Food("popcorn", 361);
        Food spag = new Food("spaghetti", 187);
        Food coffee = new Food("coffee", 38);
        Microwave m = new Microwave();
        System.out.println("Microwaving the popcorn...");
        m.putIn(popcorn);
        m.microwave();
    }
}
