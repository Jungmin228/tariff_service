package com.nhnacademy.project.repository;

public class WaterBill {
    private int seq;
    private String city;
    private String sector;
    private int unitPrice;
    private int BillTotal;

    public WaterBill(int seq, String city, String sector, int unitPrice) {
        this.seq = seq;
        this.city = city;
        this.sector = sector;
        this.unitPrice = unitPrice;
    }

    public void setBillTotal(int billTotal) {
        this.BillTotal = billTotal;
    }

    public int getUnitPrice() {
        return this.unitPrice;
    }

    public int getBillTotal() {
        return this.BillTotal;
    }

    @Override
    public String toString() {
        return "WaterBill{" +
            "seq=" + seq +
            ", city='" + city + '\'' +
            ", sector='" + sector + '\'' +
            ", unitPrice=" + unitPrice +
            ", BillTotal=" + BillTotal +
            '}';
    }
}
