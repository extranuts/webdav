package com.example.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "webdav")
public class WebDavConfig {

    private String root;
    private String username;
    private String password;



}
