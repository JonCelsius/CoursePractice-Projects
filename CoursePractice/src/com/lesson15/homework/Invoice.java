package com.lesson15.homework;

public class Invoice {
    private String deviceModel;
    private String productDescription;
    private int qtyOfProductsPurchased;
    private double priceForProduct;

    public Invoice(){

    }

    public Invoice(String deviceModel, String productDescription, int qtyOfProductsPurchased, double priceForProduct) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        if (qtyOfProductsPurchased > 0) {
            this.qtyOfProductsPurchased = qtyOfProductsPurchased;
        } else {
            this.qtyOfProductsPurchased = 0;

        }
        if (priceForProduct > 0) {
            this.priceForProduct = priceForProduct;
        } else {
            this.priceForProduct = 0.0;

        }

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
        if (qtyOfProductsPurchased > 0) {
            this.qtyOfProductsPurchased = qtyOfProductsPurchased;
        } else {
            this.qtyOfProductsPurchased = 0;

        }
    }

    public double getPriceForProduct() {
        return priceForProduct;
    }

    public void setPriceForProduct(double priceForProduct) {
        if (priceForProduct > 0) {
            this.priceForProduct = priceForProduct;
        } else {
            this.priceForProduct = 0.0;

        }
    }
    public double getAmount (){
        double amount;
        amount=qtyOfProductsPurchased*priceForProduct;
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
