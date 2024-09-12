package com.techcourse.controller;

import org.apache.coyote.http.HttpRequest;
import org.apache.coyote.http.HttpResponse;
import org.apache.coyote.http.StatusCode;

public class HomeController extends AbstractController {

    @Override
    protected void doGet(HttpRequest request, HttpResponse.HttpResponseBuilder response) throws Exception {
        buildOkResponse("Hello world!", response);
    }

    @Override
    protected void doPost(HttpRequest request, HttpResponse.HttpResponseBuilder response) {
        throw new RuntimeException();
    }

    private void buildOkResponse(String responseBody, HttpResponse.HttpResponseBuilder response) {
        response.withStatusCode(StatusCode.OK)
                .withResponseBody(responseBody)
                .addHeader("Content-Length", String.valueOf(responseBody.getBytes().length))
                .addHeader("Content-Type", "text/html");
    }
}
