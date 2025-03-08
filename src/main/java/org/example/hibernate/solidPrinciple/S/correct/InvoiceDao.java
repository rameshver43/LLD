package org.example.hibernate.solidPrinciple.S.correct;

public class InvoiceDao {
    private Invoice invoice;

    InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        System.out.println("Saving to db");
        System.out.println("Marker: " + this.invoice.getMarker());
        System.out.println("Price: "+ this.invoice.calculateTotal());
    }
}
