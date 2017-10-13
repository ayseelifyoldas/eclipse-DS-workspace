package de.vogella.osgi.ds.quoteservice;

import java.util.Random;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import de.vogella.osgi.quote.IQuoteService;

@Component(name="quote.service", immediate=true, service = IQuoteService.class)
public class QuoteService implements IQuoteService {

    @Activate
    protected void activate() {
        // do something
    }
  
    @Deactivate
    protected void deactivate() {
        // do something
    }
    @Override
    public String getQuote() {
        Random random = new Random();
        // create a number between 0 and 2
        int nextInt = random.nextInt(3);
        switch (nextInt) {
        case 0:
            return "Ds: Tell them I said something";
        case 1:
            return "Ds: I feel better already";
        default:
            return "Ds: Hubba Bubba, Baby!";
        }
    }

}