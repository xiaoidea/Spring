package config;

import ioc1.M2Pen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public M2Pen newPen() {
        return new M2Pen();
    }
}
