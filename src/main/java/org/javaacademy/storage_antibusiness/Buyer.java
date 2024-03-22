package org.javaacademy.storage_antibusiness;

import org.javaacademy.storage_antibusiness.items.Bike;
import org.javaacademy.storage_antibusiness.items.Vodka;

public class Buyer {
    private final String name;
    private Storage storage;

    public Buyer(String name, Storage storage) {
        this.name = name;
        this.storage = storage;
    }

    public void buyBrokenVodka() {
        System.out.println("Начало покупки испорченной водки покупателем: " + name);
        storage.buyItems(Vodka.class, true);
        System.out.println("Окончание покупки испорченной водки покупателем: " + name);
    }

    public void buyNotBrokenBike() {
        System.out.println("Начало покупки велосипедов покупателем: " + name);
        storage.buyItems(Bike.class, false);
        System.out.println("Окончание покупки велосипедов покупателем: " + name);
    }
}
