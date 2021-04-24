package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.view.Formatter;
import edu.bsu.cs.view.NewRevisionFormatter;


public class FormatterModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Formatter.class).to(NewRevisionFormatter.class);
    }
}
