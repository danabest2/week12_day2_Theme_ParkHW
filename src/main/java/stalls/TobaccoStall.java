package stalls;

import behaviours.IReviewed;

public class TobaccoStall extends Stall implements IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {

        super(name, ownerName, parkingSpot, rating);
    }

    @Override
    public String review(String data) {
        return null;
    }
}
