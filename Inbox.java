
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
    
    public String showInbox()
    {
        String list = "";
        for (Email email : inbox)
        {
            list += email.toString();
            list += "\n";
        }
        return list;
    }
    
    public String showStarred()
    {
        String starred = "";
        for (Email email : inbox)
        {
            if (email.getStarred())
            {
                starred += email.toString();
                starred+= "\n";
            }
        }
        return starred;
    }
    
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
    
    public String showUnread()
    {
        String unread = "";
        for (Email email : inbox)
        {
            if (!email.getRead())
            {
                unread += email.toString();
                unread += "\n";
            }
        }
        return unread;
    }
    
    public String searchSender(String sender)
    {
        String senderList = "";
        for (Email email : inbox)
        {
            if (email.getSender().equals(sender))
            {
                senderList += email.toString();
                senderList += "\n";
            }
        }
        return senderList;
    }
    
    public String sortByDate()
    {
        ArrayList<Email> byDate = new ArrayList<Email>();
        ArrayList<Email> inboxCopy = new ArrayList<Email>();
        for (int i = 0; i < inbox.size(); i++)
        {
            inboxCopy.add(inbox.get(i)); 
        }
        while (inboxCopy.size() > 0 )
        {
            int maxloc = 0;
            for (int j = 0; j < inboxCopy.size(); j++)
            {
                if (inboxCopy.get(j).getDate() > inboxCopy.get(maxloc).getDate())
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
        }
        return byDateList;
    }
}
