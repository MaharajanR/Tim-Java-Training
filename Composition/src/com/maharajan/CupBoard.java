package com.maharajan;

public class CupBoard {
    private int doorType;
    private int slab;
    private int safe;
    private Size size;

    public CupBoard(int doorType, int slab, int safe, Size size) {
        this.doorType = doorType;
        this.slab = slab;
        this.safe = safe;
        this.size = size;
    }

    public int getDoorType() {
        return doorType;
    }

    public int getSlab() {
        return slab;
    }

    public int getSafe() {
        return safe;
    }

    public Size getSize() {
        return size;
    }
}
