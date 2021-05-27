package org.launchcode.studio7;

public abstract class BaseDisc {
    private String title;
    private int storageCapacity;
    private int storageUsed;
    private int storageRemained;
    private String discModel;

    public BaseDisc(String aTitle, int aStorageCapacity, String aDiscModel, int usedCapacity) {
         title = aTitle;
         storageCapacity = aStorageCapacity;
         storageUsed = checkUsedStorage(usedCapacity);
         storageRemained = spaceLeft();
         discModel = aDiscModel;
     }
     private int checkUsedStorage(int dataOnDisc) {
        if(storageCapacity < dataOnDisc) {
            return storageCapacity;
        }
        return dataOnDisc;
     }
    private int spaceLeft() {
        return storageCapacity - storageUsed;
    }
    public String addMoreData(int inputData) {
        if (inputData < storageRemained) {
            storageUsed += inputData;
            storageRemained -= inputData;
            return "Remaining space = " + storageRemained;
        }
        return "Disc is full";

    }

    public String getTitle() {
        return title;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Storage Capacity: $" + storageCapacity + "\n";
    }
}
