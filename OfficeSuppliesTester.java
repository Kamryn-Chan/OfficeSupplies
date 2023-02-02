
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
        System.out.println("Testing the pen!");
        Pen p = new Pen();
        System.out.println("Words left: " + p.getWordsLeft());
        System.out.println("\nTrying to write now...");
        p.writeWords(10);
        System.out.println("\nUncapping the pen now for writing... Writing 20 words");
        p.uncap();
        p.writeWords(20);
        System.out.println("Words left: " + p.getWordsLeft() + ". \nCapping the pen.");
        p.cap();
        p.uncap();
        System.out.println("\nUncapping to write 30 words!");
        p.writeWords(30);
        System.out.println("Words left: " + p.getWordsLeft() + "\nBetter scribble a bit.");
        p.scribble();
        System.out.println("Words left: " + p.getWordsLeft());
        p.getCapped();
        System.out.println("Pen was not capped after writing. Minus 5 words.");
        System.out.println("Words left: " + p.getWordsLeft());
        System.out.println("\nTrying to write again...");
        p.writeWords(10);
        
        /*
        // Microwave has to be tested in terminal
        System.out.println("\nTesting the microwave! It should be tested in terminal");
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
       
        System.out.println("\nTesting the inbox! \n");
        System.out.println("Initializing an inbox and creating email objects to add...");
        Inbox i = new Inbox();
        
        System.out.println("Creating Email objects to add to inbox...");
        Email e = new Email("Mr. White", 2, "Project extension?", "Sure!");
        Email bulletin = new Email("Ms. Williams", 8, "Student bulletin", "Hi! Here is the bulletin for this week!");
        Email spam = new Email("CollegeBoard", 12, "Earn $60 in 5 minutes", "Opportunities for your future!");
        i.addEmail(e);
        i.addEmail(bulletin);
        i.addEmail(spam);
        
        System.out.println("Adding emails to the Inbox...\n");
        i.addEmail("Ms. Chung", 3, "Chinese New Year festival recording", "Enjoy!");
        i.addEmail("KOB", 5, "HW due date change", "Due Friday now!");
        i.addEmail("KOB", 9, "Thesis for paper", "Email it to me by Friday!");
        System.out.println("Displaying the inbox...");
        System.out.println(i.showInbox());
        
        System.out.println("Starring the Chinese New Year and student bulletin emails and showing starred emails...");
        i.starEmail("Chinese New Year festival recording");
        i.starEmail("Student bulletin");
        System.out.println(i.showStarred());
        
        System.out.println("Deleting the project extension and college board emails and showing the emails in trash...");
        i.deleteEmail("Project extension?");
        i.deleteEmail("Earn $60 in 5 minutes");
        System.out.println(i.showDeleted());
        
        System.out.println("Recovering the project extension email and showing all emails in the inbox (not deleted)...");
        i.recoverEmail("Project extension?");
        System.out.println(i.showNotDeleted());
        
        System.out.println("Reading the student bulletin email...");
        i.readEmail("Student bulletin");
        
        System.out.println("\nDisplaying the unread emails in the inbox...");
        System.out.println(i.showUnread());
        
        System.out.println("Searching the inbox for emails from KOB...");
        System.out.println(i.searchSender("KOB"));
        
        System.out.println("Sorting the emails in the inbox by date...");
        System.out.println(i.sortByDate());
    }
}
