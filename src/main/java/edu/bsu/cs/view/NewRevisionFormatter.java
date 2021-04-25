package edu.bsu.cs.view;
import edu.bsu.cs.model.Revision;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public final class NewRevisionFormatter implements Formatter{

    @Override
    public String format(Revision revision) {
        Instant timestamp = revision.timestamp;
        String formatDateTime = LocalDateTime.ofInstant(timestamp, ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        return String.format("The date and time is: %s, a change by %s",
                formatDateTime,
                revision.name);
    }
}
