package attractions;

import behaviours.IReviewed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
    }

    @Override
    public String review(String data) {
        return "Was reviewed " + data;
    }
}
