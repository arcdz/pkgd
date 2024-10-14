package arcdz.pkgd;

import arcdz.pkgd.config.AppProps;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DockerMessageController {

    private final AppProps appProps;

    @GetMapping("/hello")
    public String getMessage() {
        return "{ 'message': '" + appProps.message() + "'}";
    }
}
