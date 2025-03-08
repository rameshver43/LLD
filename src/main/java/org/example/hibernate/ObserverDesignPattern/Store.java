package org.example.hibernate.ObserverDesignPattern;

import org.example.hibernate.ObserverDesignPattern.Observable.IphoneObservableImpl;
import org.example.hibernate.ObserverDesignPattern.Observable.StocksObservable;
import org.example.hibernate.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import org.example.hibernate.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import org.example.hibernate.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable stocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", stocksObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl(1234512345, stocksObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("xyz3@gmail.com", stocksObservable);

        NotificationAlertObserver observer4 = new EmailAlertObserverImpl("xyz1@gmail.com", stocksObservable);
        NotificationAlertObserver observer5 = new MobileAlertObserverImpl(543211234, stocksObservable);
        NotificationAlertObserver observer6 = new EmailAlertObserverImpl("xyz3@gmail.com", stocksObservable);

        stocksObservable.add(observer1);
        stocksObservable.add(observer2);
        stocksObservable.add(observer3);
        stocksObservable.add(observer4);
        stocksObservable.add(observer5);
        stocksObservable.add(observer6);

        stocksObservable.setStockCount(10);

    }
}
