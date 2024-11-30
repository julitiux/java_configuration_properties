package com.java_configuration_properties.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Utils {

  public static <T> T getRequest(String file, Class<T> convertClass) {
    return fromJson(file, convertClass);
  }

  private static <T> T fromJson(String file, Class<T> convertClass) {
    try {
      URL url = Utils.class.getResource("/" + file);
      assert url != null;
      T response;
      response = new ObjectMapper().readValue(new File(url.getFile()), convertClass);
      return convertClass.cast(response);
    } catch (IOException ioe) {
      System.out.println(ioe);
    }
    return null;
  }
}
