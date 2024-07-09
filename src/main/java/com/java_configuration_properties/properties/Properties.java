package com.java_configuration_properties.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "properties")
public class Properties {

  private String string;
  private Integer integer;
  private String property;

}
