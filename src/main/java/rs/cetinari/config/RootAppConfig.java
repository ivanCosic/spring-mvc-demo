package rs.cetinari.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// All further configuration should here be declared, separated by comma, in order to have it all in one place.
@Import({WebMvcConfig.class})
public class RootAppConfig {
}
