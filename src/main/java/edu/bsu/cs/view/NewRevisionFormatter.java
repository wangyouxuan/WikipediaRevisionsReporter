package edu.bsu.cs.view;
import edu.bsu.cs.model.Revision;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class NewRevisionFormatter implements Formatter{

    private static final String formatDateTime = LocalDateTime.now().
            format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

    @Override
    public String format(Revision revision) {
        return String.format("The date and time is: %s, a change by %s",
                formatDateTime,
                revision.name);
    }
}
