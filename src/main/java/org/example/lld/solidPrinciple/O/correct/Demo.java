package org.example.lld.solidPrinciple.O.correct;

public class Demo {
    public static void main(String[] args) {
        Marker marker = new Marker("marker1","red", 2024, 100);
        Invoice invoice = new Invoice(marker, 10);
        System.out.println("Price: " + invoice.calculateTotal());

        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.printInvoice();

        InvoiceDao invoiceDao = new DatabaseInvoiceDao(invoice);
        invoiceDao.save();

        InvoiceDao invoiceDao1 = new FileInvoiceDao(invoice);
        invoiceDao1.save();
    }
}
