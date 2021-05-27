package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    public CD(String aTitle, int aStorageCapacity, String aDiscModel, int usedCapacity) {
        super(aTitle, aStorageCapacity, aDiscModel, usedCapacity);
    }

    @Override
    public void spinDisc() {
       System.out.println("A CD spins at a rate of 200 - 500rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Baahubali is the best movie ever!");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
