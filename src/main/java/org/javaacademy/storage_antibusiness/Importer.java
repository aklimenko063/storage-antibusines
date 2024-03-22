package org.javaacademy.storage_antibusiness;

import org.javaacademy.storage_antibusiness.items.ItemAbstract;

import java.util.List;

public class Importer {
    private final String name;
    private Storage storage;

    public Importer(String name, Storage storage) {
        this.name = name;
        this.storage = storage;
    }

    public void importItems(List<ItemAbstract> items) {
        System.out.println("Начали разгрузку поставщика: " + name);
        storage.addItem(items);
        System.out.println("Закончили разгрузку поставщика: " + name);
    }
}
