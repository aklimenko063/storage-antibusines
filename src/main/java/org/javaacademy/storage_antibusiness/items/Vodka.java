package org.javaacademy.storage_antibusiness.items;

import java.util.Objects;
import java.util.UUID;

public class Vodka extends ItemAbstract {
    private UUID partNumber = UUID.randomUUID();
    private final String name = "Водка";

    public Vodka() {
        super(false);
    }

    @Override
    public String toString() {
        return "Vodka{" +
                "name='" + name + '\'' +
                '}';
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
