package com.array.programs;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DayDate {
    public static String getDay(String day, String month, String year) {
   
  SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
  Date MyDate=null;
  try {
   MyDate = newDateFormat.parse(day+"/"+month+"/"+year);
  } catch (ParseException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  newDateFormat.applyPattern("EEEE");
  String MyDate2 = newDateFormat.format(MyDate);
  System.out.println(MyDate2);
 
        return MyDate2.toUpperCase();
    }
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String month = in.next();
    String day = in.next();
    String year = in.next();
    
    System.out.println(getDay(day, month, year));
}
}
