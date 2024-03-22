package org.javaacademy.storage_antibusiness;

import org.javaacademy.storage_antibusiness.items.Bike;
import org.javaacademy.storage_antibusiness.items.Vodka;

public class Buyer {
    private final String name;

    public Buyer(String name) {
        this.name = name;
    }

    public void buyBrokenVodka(Storage storage) {
        storage.buyItems(Vodka.class, true);
    }

    public void buyNotBrokenBike(Storage storage) {
        storage.buyItems(Bike.class, false);
    }
}
