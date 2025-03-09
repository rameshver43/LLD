package org.example.lld.ObserverDesignPattern.Observer;

import org.example.lld.ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    private long mobileNumer;
    private StocksObservable stocksObservable;

    public MobileAlertObserverImpl(long mobileNumer, StocksObservable observable){
        this.mobileNumer = mobileNumer;
        this.stocksObservable = observable;
    }
    @Override
    public void update() {
        sendMessageOnMobile(mobileNumer, "Product is in stock hurry up!");
    }

    private void sendMessageOnMobile(long mobileNumer, String msg){
        System.out.println("Msg: " + msg + " sent to: " + mobileNumer+ ". Total Stock:  " + stocksObservable.getStockCount());
    }
}
