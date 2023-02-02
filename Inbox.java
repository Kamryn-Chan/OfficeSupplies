
/**
 * The Inbox class keeps track of a list of email objects.
 *
 * @author Sharon Chou & Kamryn Chan
 * @version 2023-01-30
 */
import java.util.ArrayList;
public class Inbox
{
    // instance variables - replace the example below with your own
    private ArrayList<Email> inbox;

    /**
     * Constructor for objects of class Inbox
     */
    public Inbox()
    {
        // initialise instance variables
        inbox = new ArrayList<Email>();
    }

    /**
     * Adds emails to the inbox.
     * 
     * @param premade Email object.
     */
    public void addEmail(Email email)
    {
        inbox.add(email);
    }
    
    /**
     * Adds emails to the inbox.
     * 
     * @param parameters of Email object to be made in method and then added to Inbox.
     */
    public void addEmail(String sender, int date, String subject, String message)
    {
        Email e = new Email(sender, date, subject, message);
        inbox.add(e);
    }
    
    /**
     * Stars the email by setting the starred instance variable to true.
     * 
     * @param subject line of that email
     */
    public void starEmail(String subject)
    {
        // put your code here
        for (Email email: inbox)
        {
            if (email.getSubject().equals(subject))
            {
                email.star();
            }
        }
    }
    
    /**
     * Unstars the email by setting the starred instance variable to false.
     * 
     * @param subject line of that email
     */
    public void unstarEmail(String subject)
    {
        // put your code here
        for (Email email: inbox)
        {
            if (email.getSubject().equals(subject))
            {
                email.unstar();
            }
        }
    }
    
    /**
     * Deletes the email by setting the deleted instance variable to true.
     * 
     * @param subject line of that email
     */
    public void deleteEmail(String subject)
    {
        // put your code here
        for (int i = 0; i < inbox.size(); i++)
        {
            if (inbox.get(i).getSubject().equals(subject))
            {
                inbox.get(i).delete();
            }
        }
    }
    
    /**
     * Undeletes the email by setting the deleted instance variable to false.
     * 
     * @param subject line of that email
     */
    public void recoverEmail(String subject)
    {
        // put your code here
        for (int i = 0; i < inbox.size(); i++)
        {
            if (inbox.get(i).getSubject().equals(subject))
            {
                inbox.get(i).undelete();
            }
        }
    }
    
    /**
     * Reads the email by setting the read instance variable to true.
     * 
     *  @param subject line of that email
     */
    public void readEmail(String subject)
    {
        // put your code here
        for (int i = 0; i < inbox.size(); i++)
        {
            if (inbox.get(i).getSubject().equals(subject))
            {
                inbox.get(i).read();
            }
        }
    }
    
    /**
     * Unreads the email by setting the read instance variable to false.
     * 
     * @param subject line of that email
     */
    public void unreadEmail(String subject)
    {
        // put your code here
        for (int i = 0; i < inbox.size(); i++)
        {
            if (inbox.get(i).getSubject().equals(subject))
            {
                inbox.get(i).unread();
            }
        }
    }
    
    /**
     * Returns a String with all the emails in the inbox arraylist and their information.
     * 
     * @return String of all emails
     */
    public String showInbox()
    {
        String list = "";
        for (Email email : inbox)
        {
            if (!email.getDeleted())
            {
                list += email.toString();
                list += "\n";
            }
        }
        return list;
    }
    
    /**
     * Returns a String with all starred emails and their info.
     * 
     * @return String of starred emails
     */
    public String showStarred()
    {
        String starred = "";
        for (Email email : inbox)
        {
            if (email.getStarred() && !email.getDeleted())
            {
                starred += email.toString();
                starred+= "\n";
            }
        }
        return starred;
    }
    
    /**
     * Returns a String with all deleted emails and their info.
     * 
     * @return String of deleted emails
     */
    public String showDeleted()
    {
        String deleted = "";
        for (Email email : inbox)
        {
            if (email.getDeleted())
            {
                deleted += email.toString();
                deleted+= "\n";
            }
        }
        return deleted;
    }
    
    /**
     * Returns a String with all not deleted emails and their info.
     * 
     * @return String of not deleted emails
     */
    public String showNotDeleted()
    {
        String undeleted = "";
        for (Email email : inbox)
        {
            if (!email.getDeleted())
            {
                undeleted += email.toString();
                undeleted+= "\n";
            }
        }
        return undeleted;
    }
    
    /**
     * Returns a String with all unread emails and their info.
     * 
     * @return String of unread emails
     */
    public String showUnread()
    {
        String unread = "";
        for (Email email : inbox)
        {
            if (!email.getRead() && !email.getDeleted())
            {
                unread += email.toString();
                unread += "\n";
            }
        }
        return unread;
    }
    
    /**
     * Returns a String with all emails from a specific sender and their info.
     * 
     * @return String of emails from a specific person.
     * @param the person
     */
    public String searchSender(String sender)
    {
        String senderList = "";
        for (Email email : inbox)
        {
            if (email.getSender().equals(sender) && !email.getDeleted())
            {
                senderList += email.toString();
                senderList += "\n";
            }
        }
        return senderList;
    }
    
    /**
     * Returns a String of emails in the inbox (not including trash) sorted by date.
     * 
     * @return String of emails from earliest to latest sent.
     */
    public String sortByDate()
    {
        ArrayList<Email> byDate = new ArrayList<Email>();
        ArrayList<Email> inboxCopy = new ArrayList<Email>();
        for (int i = 0; i < inbox.size(); i++)
        {
            if (!inbox.get(i).getDeleted())
            {
                inboxCopy.add(inbox.get(i)); 
            }
        }
        while (inboxCopy.size() > 0 )
        {
            int maxloc = 0;
            for (int j = 0; j < inboxCopy.size(); j++)
            {
                if (inboxCopy.get(j).getDate() < inboxCopy.get(maxloc).getDate())
                {
                    maxloc = j;
                }
            }
            byDate.add(inboxCopy.remove(maxloc));
        }
        String byDateList = "";
        for (Email email: byDate)
        {
            byDateList += email.toString();
            byDateList += "\n";
        }
        return byDateList;
    }
}
