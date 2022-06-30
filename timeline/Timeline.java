import java.util.Date;

public class Timeline {

    private String title;
    private Event first;

    // TODO #1 (2 points): set the title and the first event properly
    public Timeline(final String title) {
        
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void add(final String description, final Date date) {
        // TODO #2 (2 points): instantiate a new event with the given parameters
        

        // TODO #3 (3 points): add the new event as the head of the list IF the collection is empty
        if (    )
            

        // TODO #4 (5 points): insert the new event before the head of the list IF the new event happened before the current first event
        // hint: use compareTo
        else if (     ) {
            

        }
        else {
            // TODO #5 (2 points): set current (event) to be the first event
            

            // TODO #6 (3 points): loop until the current event becomes the tail
            while (     ) {

                // TODO #7 (6 points): inside the loop, insert the new event right after the current event IF the coming event is happening (chronologically) after the new event; if that happens, return; if not, advance the current event (reference)
                
            }

            // TODO #8 (2 points): outside the loop, add the new event after the tail event
            
        }
    }

    @Override
    public String toString() {
        String out = title + "\n";
        Event current = first;
        while (current != null) {
            out += "\t" + current + "\n";
            current = current.getNext();
        }
        // optional (get rid of the last \n)
        out = out.trim();
        return out;
    }
}
