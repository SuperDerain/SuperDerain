package superown.microsvc.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(AppApplication.class)
                .properties("server.port=" + 9891)
                .run(args);
    }

}
