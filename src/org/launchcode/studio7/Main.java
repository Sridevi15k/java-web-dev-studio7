package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("Baahubali", 1000, "CD-R", 550);
        DVD myDvd = new DVD("Manam", 5000, "DVD-R", 1550);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myDvd.spinDisc();

        myCd.readData();
        myDvd.readData();

        System.out.println(myCd.addMoreData(400));
        System.out.println(myDvd.addMoreData(1000));
    }
}
