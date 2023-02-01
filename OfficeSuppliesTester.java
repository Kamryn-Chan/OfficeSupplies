
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
        /*
        System.out.println("Testing the pen!");
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
        /*
        System.out.println("Testing the microwave!");
        Food popcorn = new Food("popcorn", 126);
        Food spag = new Food("spaghetti", 187);
        Food coffee = new Food("coffee", 38);
        Microwave m = new Microwave();
        System.out.println("Microwaving the popcorn...");
        m.putIn(popcorn);
        m.microwave();
        System.out.println();
        System.out.println("Microwaving the spaghetti...");
        m.putIn(spag);
        m.microwave();
        System.out.println();
        System.out.println("Microwaving the coffee...");
        m.putIn(coffee);
        m.microwave();
        System.out.println("Bon apetit!");
        */
       
        System.out.println("Testing the inbox!");
        System.out.println("Initializing an inbox and creating email objects to add...\n");
        Inbox i = new Inbox();
        Email e = new Email("Mr. White", 1, "Project extension?", "Sure!");
        Email bulletin = new Email("Ms. Williams", 8, "Student bulletin", "Bulletin for this week!");
        Email spam = new Email("CollegeBoard", 12, "Earn $60 in 5 minutes", "Opportunities for your future!");
        Email festival = new Email("Ms. Chung", 3, "Chinese New Year festival recording", "Enjoy!");
        Email meeting = new Email("KOB", 5, "HW due date change", "Due Friday now!");
        System.out.println("Displaying the inbox...\n");
        System.out.println(i.showInbox());
        System.out.println("Starring the Chinese New Year and student bulletin emails...\n");
        i.starEmail("Chinese New Year festival recording");
        i.starEmail("Student bulletin");
        System.out.println(i.showInbox());
    }
}
