package com.java_configuration_properties.properties;

import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@lombok.Data
@Configuration
@ConfigurationProperties(prefix = "data")
@ToString
public class Data {
  private Notification notification;
}
