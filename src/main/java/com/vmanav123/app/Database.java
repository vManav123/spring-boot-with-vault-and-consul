package com.vmanav123.app;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ToString
@ConfigurationProperties(prefix = "db")
public class Database {
    private String username;
    private String password;
    private String url;
}
