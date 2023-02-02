
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
    
    /**
     * Returns sender.
     * 
     * @return sender
     */
    public String getSender()
    {
        return sender;
    }
    
    /**
     * Returns date.
     * 
     * @return date
     */
    public int getDate()
    {
        return date;
    }
    
    /**
     * Returns subject.
     * 
     * @return subject
     */
    public String getSubject()
    {
        return subject;
    }
    
    /**
     * Returns message.
     * 
     * @return message
     */
    public String getMessage()
    {
        return message;
    }
    
    /**
     * Returns starred status.
     * 
     * @return starred status
     */
    public boolean getStarred()
    {
        return starred;
    }
    
    /**
     * Returns read status.
     * 
     * @return read status
     */
    public boolean getRead()
    {
        return read;
    }
    
    /**
     * Returns deleted status.
     * 
     * @return deleted status
     */
    public boolean getDeleted()
    {
        return deleted;
    }
    
    /**
     * Stars the email by setting the starred instance variable to true.
     */
    public void star()
    {
       starred = true; 
    }
    
    /**
     * Unstars the email by setting the starred instance variable to false.
     */
    public void unstar()
    {
        starred = false;
    }
    
    /**
     * Reads the email by setting the read instance variable to true.
     */
    public void read()
    {
        System.out.println(message);
        read = true;  
    }
    
    /**
     * Unreads the email by setting the read instance variable to false.
     */
    public void unread()
    {
        read = false;
    }
    
    /**
     * Deletes the email by setting the deleted instance variable to true.
     */
    public void delete()
    {
        deleted = true;
    }
    
    /**
     * Undeletes the email by setting the deleted instance variable to false.
     */
    public void undelete()
    {
        deleted = false;
    }
    
    /**
     * Gives information about the email object including sender, subject, and date sent.
     * 
     * @return String containing the info
     */
    public String toString()
    {
        String emails = sender + " - " + subject + " - " + date + " days ago";
        if (starred)
        {
            emails += " - STARRED";
        }
        if (!read)
        {
            emails += " - UNREAD";
        }
        if (deleted)
        {
            emails += " - TRASH";
        }
        return emails;
    }
}
