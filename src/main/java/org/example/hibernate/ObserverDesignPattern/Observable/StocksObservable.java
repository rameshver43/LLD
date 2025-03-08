package org.example.hibernate.ObserverDesignPattern.Observable;

import org.example.hibernate.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver obj);
    void remove(NotificationAlertObserver obj);
    void notifySubscribers();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
