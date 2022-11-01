package com.times132.ddd.common.domain;

public class AggregateRoot<T> {
    public T object;
    protected String id;

    protected AggregateRoot(T object, String id) {
        this.object = object;
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
