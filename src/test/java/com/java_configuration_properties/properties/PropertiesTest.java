package com.java_configuration_properties.properties;

import com.java_configuration_properties.util.Utils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertiesTest {

  private Properties properties;

  @BeforeEach
  void setup() {
    properties = Utils.getRequest("Properties.json", Properties.class);
  }

  @Test
  void getDataFromProperties() {
    System.out.println(properties.getString());
    System.out.println(properties.getInteger());
    System.out.println(properties.getProperty());
  }

}