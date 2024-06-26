package com.erkan.questApp.core.utilities.results;

public class DataResult<T> extends Result {
    private final T data;

    public DataResult(T data, boolean success, String message) {
        super(success, message);
        this.data = data;
    }

    public DataResult(T data, boolean success) {
        this(data, success, null);
    }

    public T getData() {
        return data;
    }
}