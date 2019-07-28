package com.habibridho.learn_rest.model;

public class Response<T> {
    private final String message;
    private final T data;


    public Response(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
