package io.codelex.oop.summary.ordersAndInvoices;

import java.util.List;

public class Invoice {
    private List<AbstractItem> invoiceList;
    String invoiceNumber;
    Enum invoiceStatus = InvoiceStatus.APPROVED;
    int vat;
    double priceWithVAT;

    public Invoice(List<AbstractItem> order, String invoiceNumber) {
        this.invoiceList = order;
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        String verticalWallSymbol = "=";
        return "===================================================\n" +
                String.format("%-1s %-47s %1s %n", verticalWallSymbol, "INVOICE NUMBER: " + invoiceNumber, verticalWallSymbol) +
                String.format("%-1s %-47s %1s", verticalWallSymbol, "STATUS: " + invoiceStatus, verticalWallSymbol);
    }


    public double getOrderSum() {
        double result = invoiceList.stream().mapToDouble(AbstractItem::getPriceWithoutVAT).sum();
        return result;
    }


}
