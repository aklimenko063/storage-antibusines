package org.javaacademy.storage_antibusiness.items;

import java.util.Objects;
import java.util.UUID;

public class Bike extends ItemAbstract {
    private UUID partNumber = UUID.randomUUID();
    public Bike() {
        super(false);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partNumber);
    }
}
