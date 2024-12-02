package com.java_configuration_properties.properties;

import com.java_configuration_properties.util.Utils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.IconUIResource;
import java.util.List;

class DataTest {

  private Data data;

  @BeforeEach
  void setup() {
    data = Utils.getRequest("Data.json", Data.class);
  }

  @Test
  void testDataProperties() {
    System.out.println(data);
    List<Comm> commList = data.getNotification().getCommunication().get("comm0001");
    System.out.println(commList);
  }

}