package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String aTitle, int aStorageCapacity, String aDiscModel, int usedCapacity) {
        super(aTitle, aStorageCapacity, aDiscModel, usedCapacity);
    }

    @Override
    public void spinDisc() {
       System.out.println("DVD spins at a rate of 570 - 1600rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Manam is the best movie featuring 3 generations of hero's real family.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
