import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

class Event implements Comparable<Event> {

    private String description;
    private Date   date;
    private Event  next;

    public Event(String description, Date date) {
        this.description = description;
        this.date = date;
        next = null;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event getNext() {
        return next;
    }

    public void setNext(Event next) {
        this.next = next;
    }

    public Date getDate() {
        return date;
    }


    @Override
    public int compareTo(Event other) {
        return date.compareTo(other.date);
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        return  df.format(date) + ": " + description;
    }
}
