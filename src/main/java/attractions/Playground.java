package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements IReviewed, ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public String review(String data) {
        return "Was reviewed " + data;
    }

    public boolean isAllowedTo(Visitor visitor2){
        if(visitor2.getAge() <=15 ){
            return true;
        }
        return false;
    };
}
