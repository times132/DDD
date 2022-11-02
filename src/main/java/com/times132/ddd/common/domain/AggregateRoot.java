package com.times132.ddd.common.domain;

public class AggregateRoot<T> {
    public T object;
    protected Long id;

    protected AggregateRoot(T object, Long id) {
        this.object = object;
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
}
