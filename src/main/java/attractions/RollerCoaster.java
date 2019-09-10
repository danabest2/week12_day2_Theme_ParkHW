package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements IReviewed, ISecurity {

    public RollerCoaster(String name, int rating) {

        super(name, rating);

    }

    public boolean isAllowedTo(Visitor visitor1){
        if((visitor1.getAge() > 12) &&
            (visitor1.getHeight()) > 1.45){
            return true;
        }
        return false;
    };


    public double priceFor(Visitor visitor4){
        if(visitor4.getHeight() >= 2.00) {
            return 8.40 * 2;
        } else {
            return 8.40;
        }
    }
}
