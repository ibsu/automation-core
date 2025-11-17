package com.test.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Getter
@Setter
@PropertySource("classpath:")
@ComponentScan({"com.test"})
public class DemoqaConfig {
    @Value("${app.url}")
    private String appUrl;

    @Value("${browser}")
    private String browser;
}
