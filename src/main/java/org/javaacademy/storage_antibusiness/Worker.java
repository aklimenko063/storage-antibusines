package org.javaacademy.storage_antibusiness;

import org.javaacademy.storage_antibusiness.items.ItemAbstract;

import java.util.List;

public class Worker {
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public void addItems(Storage storage, List<ItemAbstract> items) {
        if (!items.isEmpty()) {
            ItemAbstract itemAbstract = items.get(items.size() - 1);
            if (items.size() % 2 == 0) {
                itemAbstract.setBroken(true);
            }
            System.out.println(itemAbstract.hashCode());
            items.remove(itemAbstract);
            storage.getItems().put(itemAbstract, itemAbstract);
        }
    }

    public void getItems(Storage storage, Class itemClass, boolean broken) {
        List<ItemAbstract> findingItems = storage.getItems().entrySet().stream()
                .filter(item -> item.getValue().getClass() == itemClass)
                .filter(item -> item.getValue().isBroken() == broken)
                .map(element -> element.getValue())
                .toList();
        if (!findingItems.isEmpty()) {
            storage.getItems().remove(findingItems.get(0));
        }
    }
}
