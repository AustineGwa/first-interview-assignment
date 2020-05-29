package com.geeksarena.swipe_pay_interview_assignment.models;

public class Transaction {

    private  int image;
    private  String title;
    private  String description;
    private  String amount;
    private  String date;

    public Transaction() {
    }

    public Transaction(int image, String title, String description, String amount, String date) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
