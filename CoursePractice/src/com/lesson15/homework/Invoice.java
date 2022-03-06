package com.lesson15.homework;

public class Invoice {
    private String deviceModel;
    private String productDescription;
    private int qtyOfProductsPurchased;
    private double priceForProduct;

    public Invoice() {

    }

    public Invoice(String deviceModel, String productDescription, int qtyOfProductsPurchased, double priceForProduct) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        this.qtyOfProductsPurchased = checkValue(qtyOfProductsPurchased);
        this.priceForProduct = checkValue(priceForProduct);

    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQtyOfProductsPurchased() {
        return qtyOfProductsPurchased;
    }

    public void setQtyOfProductsPurchased(int qtyOfProductsPurchased) {
        this.qtyOfProductsPurchased = checkValue(qtyOfProductsPurchased);
    }

    public double getPriceForProduct() {
        return priceForProduct;
    }

    public void setPriceForProduct(double priceForProduct) {
        this.priceForProduct = checkValue(priceForProduct);
    }

    public int checkValue(int value) {
        return value > 0 ? value : 0;
    }

    //Overloaded
    public double checkValue(double value) {
        return value > 0 ? value : 0.0;
    }

    public double getAmount() {
        double amount;
        amount = qtyOfProductsPurchased * priceForProduct;
        return amount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "deviceModel='" + deviceModel + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", qtyOfProductsPurchased=" + qtyOfProductsPurchased +
                ", priceForProduct=" + priceForProduct +
                '}';
    }
}
