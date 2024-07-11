package com.java_configuration_properties.controller;

import com.java_configuration_properties.properties.Properties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class PropertiesController {

  private final Properties properties;

  public PropertiesController(Properties properties) {
    this.properties = properties;
  }

  @GetMapping("/get")
  public void test() {
    log.info("{}", properties.getString());
    log.info("{}", properties.getInteger());
    log.info("{}", properties.getProperty());
  }

}
