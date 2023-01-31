
/**
 * Class Email makes objects that are put in an Inbox object.
 *
 * @Sharon Chou & Kamryn Chan
 * @2023-01-30
 */
public class Email
{
    private String sender;
    private int date; //days ago it was sent
    private String subject;
    private String message;
    //flags for the email objects:
    private boolean starred;
    private boolean read;
    private boolean deleted; 

    /**
     * Constructor for objects of class Email
     */
    public Email(String sender, int date, String subject, String message)
    {
       this.sender = sender;
       this.date = date;
       this.subject = subject;
       this.message = message;
       starred = false;
       read = false;
       deleted = false;
    }
    
    public String getSender()
    {
        return sender;
    }
    
    public int getDate()
    {
        return date;
    }
    
    public String getSubject()
    {
        return subject;
    }
    
    public String getMessage()
    {
        return message;
    }
    
    public boolean getStarred()
    {
        return starred;
    }
    
    public boolean getRead()
    {
        return read;
    }
    
    public boolean getDeleted()
    {
        return deleted;
    }
    
    public void star()
    {
       starred = true; 
    }
    
    public void unstar()
    {
        starred = false;
    }
    
    public void read()
    {
        System.out.println(message);
        read = true;  
    }
    
    public void unread()
    {
        read = false;
    }
    
    public void delete()
    {
        deleted = true;
    }
    
    public void undelete()
    {
        deleted = false;
    }
    
    public String toString()
    {
        String emails = sender + " - " + subject + " - " + date + " days ago";
        return emails;
    }
}
