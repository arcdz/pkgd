package arcdz.pkgd;

import arcdz.pkgd.config.AppProps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProps.class)
public class PkgdApplication {

    public static void main(String[] args) {
        SpringApplication.run(PkgdApplication.class, args);
    }

}
