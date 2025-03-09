package org.example.lld.solidPrinciple.O.correct;

public class DatabaseInvoiceDao implements InvoiceDao{
    private Invoice invoice;

    DatabaseInvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving to db");
        System.out.println("Marker: " + this.invoice.getMarker());
        System.out.println("Price: "+ this.invoice.calculateTotal());
    }
}
