package org.javaacademy.storage_antibusiness;

import org.javaacademy.storage_antibusiness.items.Bike;
import org.javaacademy.storage_antibusiness.items.Vodka;

public class Buyer {
    private final String name;

    public Buyer(String name) {
        this.name = name;
    }

    public void buyBrokenVodka(Storage storage) {
        System.out.println("Начало покупки испорченной водки покупателем: " + name);
        storage.buyItems(Vodka.class, true);
        System.out.println("Окончание покупки испорченной водки покупателем: " + name);
    }

    public void buyNotBrokenBike(Storage storage) {
        System.out.println("Начало покупки велосипедов покупателем: " + name);
        storage.buyItems(Bike.class, false);
        System.out.println("Окончание покупки велосипедов покупателем: " + name);
    }
}
