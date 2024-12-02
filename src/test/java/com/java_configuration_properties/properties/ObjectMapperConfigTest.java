package com.java_configuration_properties.properties;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ObjectMapperConfigTest {

  @Test
  public void testObjectMapperBeanCreation() {
    try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ObjectMapperConfig.class)){
      ObjectMapper objectMapper = context.getBean(ObjectMapper.class);
      boolean failOnUnknowPRoeprties = objectMapper.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
      assertNotNull(failOnUnknowPRoeprties, "El objectmapper debe desactivar FAIL_ON_UNKNOWN_PROPERTIES");
      assert (!failOnUnknowPRoeprties) : "El ObjectMapper debería estar configurado con FAIL_ON_UNKNOWN_PROPERTIES=false";
    }
  }

}