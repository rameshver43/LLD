package org.example.lld.solidPrinciple.O.correct;

public class InvoicePrinter {
   private Invoice invoice;

   InvoicePrinter(Invoice invoice){
       this.invoice = invoice;
   }

   public void printInvoice(){
       System.out.println("Printing invoice for you: ");
       System.out.println("Marker: " + invoice.getMarker());
       System.out.println("Price: " + invoice.calculateTotal());
   }
}
