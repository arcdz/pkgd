package arcdz.pkgd.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public record AppProps(
        String salutation, String message,
        Version version,
        Channels channels) {
    private record Version(
            String number,
            String date
    ) { }

    private record Channels(
            String id
    ) { }
}