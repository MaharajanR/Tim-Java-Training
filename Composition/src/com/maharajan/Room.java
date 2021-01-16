package com.maharajan;

public class Room {
    private Bed bed;
    private CupBoard cupBoard;
    private Table table;

    public Room(Bed bed, CupBoard cupBoard, Table table) {
        this.bed = bed;
        this.cupBoard = cupBoard;
        this.table = table;
    }

    public void bedCals() {
        System.out.println("bedCal called");
        bed.bedNameis(bed.getModal());

    }
}
