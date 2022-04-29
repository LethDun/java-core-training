package com.ec.oop.exercises.problem2.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  public static Date stringToDate(String dob) {
    try {
      Date dobDate = sdf.parse(dob);
      return dobDate;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public static String dateToString(Date dobDate) {
    return sdf.format(dobDate);
  }
}
