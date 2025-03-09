package org.example.lld.ObserverDesignPattern.Observer;

import org.example.lld.ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    private final String emailId;
    private final StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable){
        this.emailId = emailId;
        this.stocksObservable =stocksObservable;
    }
    @Override
    public void update() {
        sendEmail("Product is in stock hurry up!");
    }

    private void sendEmail(String msg){
        System.out.println("Email: + " + msg+ "  sent to: " + this.emailId + ". Total Stock:  " + stocksObservable.getStockCount());
    }
}
