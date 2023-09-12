package org.apache.coyote.http11.handler.mapper;

import nextstep.jwp.controller.RegisterController;
import org.apache.catalina.controller.Controller;
import org.apache.coyote.http11.request.HttpRequest;
import org.apache.coyote.http11.response.HttpResponse;

public class RegisterHandlerMapper implements HandlerMapper {

  private static final String URL = "/register";
  private static final Controller controller = new RegisterController();

  @Override
  public boolean isSupport(final HttpRequest request) {
    return request.isUrlEndWith(URL) && (request.isGetMethod() || request.isPostMethod());
  }

  @Override
  public void handle(final HttpRequest request, final HttpResponse response) {
    controller.service(request, response);
  }
}
