package com.test.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class DemoqaConfig {
    @Value("${app.url}")
    private String appUrl;

    @Value("${browser}")
    private String browser;
}
