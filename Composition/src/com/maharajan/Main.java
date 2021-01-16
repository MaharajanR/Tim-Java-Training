package com.maharajan;

public class Main {

    public static void main(String[] args) {
        Size bedSize = new Size(5, 50, 500);
        Bed bed = new Bed("Kurl-On", "King size", bedSize);

        Size cupBoardSize = new Size(60, 6, 600);
        CupBoard cupBoard = new CupBoard(2, 10, 1, cupBoardSize);

        Size tableSize = new Size(40, 4, 400);
        Table table = new Table(4, "yellow", tableSize);

        Room room=new Room(bed,cupBoard,table);
        room.bedCals();
    }
}
