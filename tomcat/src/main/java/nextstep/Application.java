package nextstep;

import nextstep.jwp.presentation.HomePageController;
import nextstep.jwp.presentation.LoginController;
import nextstep.jwp.presentation.LoginPageController;
import nextstep.jwp.presentation.RegisterPageController;
import org.apache.catalina.controller.ControllerMappingInfo;
import org.apache.catalina.controller.RequestMapping;
import org.apache.catalina.startup.Tomcat;

import static org.apache.coyote.request.HttpMethod.GET;
import static org.apache.coyote.request.HttpMethod.POST;

public class Application {

    public static void main(String[] args) {
        final RequestMapping requestMapping = new RequestMapping()
                .putController(ControllerMappingInfo.of(GET, false, "/"), new HomePageController())
                .putController(ControllerMappingInfo.of(GET, false, "/login"), new LoginPageController())
                .putController(ControllerMappingInfo.of(GET, true, "/login"), new LoginController())
                .putController(ControllerMappingInfo.of(GET, false, "/register"), new RegisterPageController())
                .putController(ControllerMappingInfo.of(POST, false, "/register"), new RegisterPageController());

        final Tomcat tomcat = new Tomcat(requestMapping);
        tomcat.start();
    }
}
