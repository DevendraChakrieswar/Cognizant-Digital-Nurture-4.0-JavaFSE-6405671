package com.devendra.project;

public class MyService2 {
    private ExternalApi2 api;
    public MyService2(ExternalApi2 api) {
        this.api = api;
    }
    public String fetchData(String token) {
        return api.getData(token);
    }
}
