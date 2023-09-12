package nextstep.jwp.controller;

import org.apache.catalina.controller.AbstractController;
import org.apache.coyote.http11.request.HttpRequest;
import org.apache.coyote.http11.response.HttpResponse;

public class StaticFileController extends AbstractController {

  @Override
  protected void doGet(final HttpRequest request, final HttpResponse response) {
    final String url = request.getUrl();
    response.setBodyAsStaticFile(url);
  }
}
