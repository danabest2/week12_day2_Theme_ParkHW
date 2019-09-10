package attractions;

import behaviours.IReviewed;

public class Dodgems extends Attraction implements IReviewed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    @Override
    public String review(String data) {
        return "Was reviewed " + data;
    }
}
