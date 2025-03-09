package org.example.lld.ObserverDesignPattern.Observable;

import org.example.lld.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver obj);
    void remove(NotificationAlertObserver obj);
    void notifySubscribers();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
