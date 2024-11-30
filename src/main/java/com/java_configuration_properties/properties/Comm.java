package com.java_configuration_properties.properties;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Comm {
  private String metodoEnvio;
  private String templateId;
  private String alertType;
}
