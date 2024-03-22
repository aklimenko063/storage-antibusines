package org.javaacademy.storage_antibusiness;

import org.javaacademy.storage_antibusiness.items.ItemAbstract;

import java.util.List;

public class Importer {
    private final String name;

    public Importer(String name) {
        this.name = name;
    }

    public void importItems(Storage storage, List<ItemAbstract> items) {
        System.out.println("Начали разгрузку поставщика: " + name);
        storage.addItem(items);
        System.out.println("Закончили разгрузку поставщика: " + name);
    }
}
