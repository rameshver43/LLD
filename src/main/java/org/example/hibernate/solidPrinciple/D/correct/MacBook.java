package org.example.hibernate.solidPrinciple.D.correct;

import org.example.hibernate.solidPrinciple.D.wrong.KeyBoard;

public class MacBook {
    private final Mouse mouse;
    private final KeyBoard wiredKeyBoad;

    public MacBook(Mouse mouse, KeyBoard wiredKeyBoad) {
        this.mouse = mouse;
        this.wiredKeyBoad = wiredKeyBoad;
    }
}
