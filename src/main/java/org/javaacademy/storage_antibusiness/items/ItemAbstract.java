package org.javaacademy.storage_antibusiness.items;

import java.util.Objects;

public abstract class ItemAbstract {
    private boolean broken;

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public ItemAbstract(boolean broken) {
        this.broken = broken;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getClass());
    }
}
