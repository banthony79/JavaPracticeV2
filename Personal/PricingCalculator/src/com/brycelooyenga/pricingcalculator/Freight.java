package com.brycelooyenga.pricingcalculator;

public class Freight {

    private Pit pit;
    private Customer customer;
    private Product product;
    private Zone zone;


    public Freight(Pit pit, Customer customer, Product product, Zone zone) {
        this.pit = pit;
        this.customer = customer;
        this.product = product;
        this.zone = zone;

    }

   private static String formatter(double dollar) {
        return "$" + String.format("%.2f", dollar);
   }


    public double calculateDeliveredPriceSub(double price) {
        return price - pit.getRate(zone.getZoneNumber());
    }

    public double calculateDeliveredPriceAdd(double price) {
        return price + pit.getRate(zone.getZoneNumber());
    }

    public double pickUp() {
        return product.getPrice() - pit.getPickupDiscount();
    }

    public double pickUp(double price) {
        return price - pit.getPickupDiscount();
    }

    public double calculateFreight(int kms, double rate) {
        return kms * (100/rate);
    }

    public double deliverNoProduct(double price) {
        return price - pit.getRate(this.zone.getZoneNumber());
    }

    public String deliverNoProductToString(double price) {
        return  pit.getPitNumber() + ": " + price + " - " + pit.getRate(this.zone.getZoneNumber())
                + " = " + formatter(price - pit.getRate(this.zone.getZoneNumber()));
    }

    public String pickUpString(double price) {
        return "Product Price: " + formatter(price) + " - " + "Pick Up Discount from " +
                pit.getPitName() +" - " + formatter(pit.getPickupDiscount()) + " = " + formatter(pickUp(price))
                + "\n";
    }

    public String deliveredString(double price) {
       return (formatter(price) + "\n" + "Zone: " + zone.getZoneName() + "\n" + "Freight Rate: "
               + formatter(pit.getRate(zone.getZoneNumber())) +    "\n" +
        "Price Delivered: (freight added): " + formatter(calculateDeliveredPriceAdd(price)) + "\n" +
        "Price Delivered: (freight deducted): " + formatter(calculateDeliveredPriceSub(price))) + "\n";

    }

    public String deliveredString() {
        return (customer.getName() + "\n" + "(" + product.getName() +")" + formatter(product.getProductCode()) + " - " + formatter(product.getPrice()) + "\n" + "Zone: " + zone.getZoneName() + "\n" + "Freight Rate: "
                + formatter(pit.getRate(zone.getZoneNumber())) +    "\n" +
                "Price Delivered: (freight added): " + formatter(calculateDeliveredPriceAdd(product.getPrice())) + "\n" +
                "Price Delivered: (freight deducted): " + formatter(calculateDeliveredPriceSub(product.getPrice()))) + "\n";

    }


}
