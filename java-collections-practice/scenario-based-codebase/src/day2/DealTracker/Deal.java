package day2.DealTracker;

import java.time.*;

public class Deal extends Promotion<String> {

    private final String dealCode;
    private final LocalDate validTill;
    private final double discount;
    private final int minPurchase;

    public Deal(String dealCode, LocalDate validTill,
                double discount, int minPurchase) {
        super("DISCOUNT");
        this.dealCode = dealCode;
        this.validTill = validTill;
        this.discount = discount;
        this.minPurchase = minPurchase;
    }

    public String getDealCode() {
        return dealCode;
    }

    public LocalDate getValidTill() {
        return validTill;
    }

    public double getDiscount() {
        return discount;
    }

    public int getMinPurchase() {
        return minPurchase;
    }

    @Override
    public String getCode() {
        return dealCode;
    }

    @Override
    public double getValue() {
        return discount;
    }

    @Override
    public String toString() {
        return dealCode + " | " + discount + "% | Valid Till: " +
                validTill + " | Min " + minPurchase;
    }
}