package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements IReviewed, ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {

        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public String review(String data) {
        return null;
    }

    public boolean isAllowedTo(Visitor visitor2){
        if(visitor2.getAge() >=18 ){
            return true;
        }
        return false;
    };
}
