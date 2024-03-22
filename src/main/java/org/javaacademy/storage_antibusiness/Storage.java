package org.javaacademy.storage_antibusiness;

import org.javaacademy.storage_antibusiness.items.ItemAbstract;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Worker worker1;
    private Worker worker2;
    private Map<ItemAbstract, ItemAbstract> items = new HashMap<>();

    public Storage(Worker worker1, Worker worker2) {
        this.worker1 = worker1;
        this.worker2 = worker2;
    }

    public Map<ItemAbstract, ItemAbstract> getItems() {
        return items;
    }

    public void addItem(List<ItemAbstract> items) {
        List<Worker> workers = List.of(worker1, worker2);
        while (!items.isEmpty()) {
            workers.forEach(worker -> worker.addItems(this, items));
        }
    }

    public void buyItems(Class itemClass, boolean broken) {
        List<Worker> workers = List.of(worker1, worker2);
        workers.forEach(worker -> worker.getItems(this, itemClass, broken));
    }
}
