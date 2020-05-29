package com.geeksarena.swipe_pay_interview_assignment.models;

public class Stock {
    private int image;
    private String outOfStockTxt;
    private String label;

    public Stock() {
    }

    public Stock(int image, String outOfStockTxt, String label) {
        this.image = image;
        this.outOfStockTxt = outOfStockTxt;
        this.label = label;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getOutOfStockTxt() {
        return outOfStockTxt;
    }

    public void setOutOfStockTxt(String outOfStockTxt) {
        this.outOfStockTxt = outOfStockTxt;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
