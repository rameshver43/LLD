package org.example.lld.solidPrinciple.O.correct;

public class FileInvoiceDao implements InvoiceDao{
    private Invoice invoice;

    FileInvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving to file");
        System.out.println("Marker: " + this.invoice.getMarker());
        System.out.println("Price: "+ this.invoice.calculateTotal());
    }
}
