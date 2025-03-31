package com.test.automation_core.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class DemoqaConfig {
    @Value("${app.url}")
    private String appUrl;

    @Value("{browser}:FIREFOX")
    private String browser;
}
