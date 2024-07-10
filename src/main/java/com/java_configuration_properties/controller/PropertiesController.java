package com.java_configuration_properties.controller;

import com.java_configuration_properties.properties.Properties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PropertiesController {

  private final Properties properties;

  public PropertiesController(Properties properties) {
    this.properties = properties;
  }

  @GetMapping("/get")
  public void test() {
    System.out.println(properties.getString());
    System.out.println(properties.getInteger());
    System.out.println(properties.getProperty());
  }

}
