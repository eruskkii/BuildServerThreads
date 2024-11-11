package org.example;

import service.HttpServerServiceImpl;

import static common.SimpleHTTPServer.PORT;

public class Main {
    public static void main(String[] args) {

        HttpServerServiceImpl service = new HttpServerServiceImpl();

        service.start(PORT);
    }
}