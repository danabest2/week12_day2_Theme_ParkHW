package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements IReviewed, ISecurity {

    public RollerCoaster(String name, int rating) {

        super(name, rating);

    }

    public String review(String data) {
        return "Was reviewed " + data;}

    public boolean isAllowedTo(Visitor visitor1){
        if(visitor1.getAge() < 12 ){
            return true;
        }
        return false;
    };

}
