package com.java_configuration_properties.properties;

import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Data
@ToString
public class Notification {
  private Map<String, List<Comm>> communication;
}
