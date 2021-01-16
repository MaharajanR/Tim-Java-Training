package com.maharajan;

public class Bed {
    private String modal;
    private String sizeName;
    private Size size;

    public Bed(String modal, String sizeName, Size size) {
        this.modal = modal;
        this.sizeName = sizeName;
        this.size = size;
    }

    public void bedNameis(String modal) {
        System.out.println("Bed modal is " + modal);

    }

    public String getModal() {
        return modal;
    }

    public String getSizeName() {
        return sizeName;
    }

    public Size getSize() {
        return size;
    }
}
