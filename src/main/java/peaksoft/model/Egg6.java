package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    @Autowired
    private Needle7 needle7;

    @Override
    public String toString() {
        return ", needle in the egg, " + needle7.toString();
    }
}
