package com.tap.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.tap.pojo", "com.tap.pojo2"})
public class ConfigFile {

}
