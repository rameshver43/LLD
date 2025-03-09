package org.example.lld.ObserverDesignPattern.Observable;

import org.example.lld.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount =0;

    @Override
    public void add(NotificationAlertObserver obj) {
        this.observerList.add(obj);
    }

    @Override
    public void remove(NotificationAlertObserver obj) {
        this.observerList.remove(obj);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver obj: observerList){
            obj.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        int oldValue= stockCount;
        this.stockCount+=newStockAdded;
        if(oldValue == 0 && newStockAdded>0)
        {
            notifySubscribers();
        }


    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
