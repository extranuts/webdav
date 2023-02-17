package com.example.webdav;

import com.example.config.WebDavConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties ({
        WebDavConfig.class
})
public class WebdavApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebdavApplication.class, args);
    }

}
