package me.javaroad.oauth.config;

import me.javaroad.web.config.Swagger2Config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author heyx
 */
@Import({
    Swagger2Config.class
})
@Configuration
public class AppConfig {

}