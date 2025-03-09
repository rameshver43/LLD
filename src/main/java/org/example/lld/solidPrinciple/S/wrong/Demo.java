package org.example.lld.solidPrinciple.S.wrong;

public class Demo {
    public static void main(String[] args) {
        Marker marker = new Marker("marker1","red", 2024, 100);
        Invoice invoice = new Invoice(marker, 10);
        System.out.println("Price: " + invoice.calculateTotal());
        invoice.printInvoice();
        invoice.saveToDB();
    }
}
