
package com.creactiviti.piper.core.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Throwables;

public class JsonHelper {
  
  private static final ObjectMapper defaultObjectMapper = new ObjectMapper ();

  public static <T> T readValue (ObjectMapper aObjectMapper, String aValue, Class<T> aClass) {
    try {
      return aObjectMapper.readValue(aValue, aClass);
    } catch (Exception e) {
      throw Throwables.propagate(e);
    }
  }
  
  public static String writeValueAsString (Object aValue) {
    return writeValueAsString(defaultObjectMapper, aValue);
  }
  
  public static String writeValueAsString (ObjectMapper aObjectMapper, Object aValue) {
    try {
      return aObjectMapper.writeValueAsString(aValue);
    } catch (Exception e) {
      throw Throwables.propagate(e);
    }
  }

}
