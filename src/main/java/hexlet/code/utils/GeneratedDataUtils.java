package hexlet.code.utils;

import net.datafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GeneratedDataUtils {

    @Bean
    public Faker getFaker() {
        return new Faker();
    }
}
