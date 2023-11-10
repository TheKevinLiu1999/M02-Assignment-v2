//Kevin Liu
//November 6, 2023
//Professor Bowman
//SDEV200-1AH
//Chapter 10, Exercise 10.14: MyDate Class

import java.util.GregorianCalendar;

public class MyDate {
  public void setYear(final int year) {
    this.year = year;
  }

  public void setMonth(final int month) {
    this.month = month;
  }

  public void setDay(final int day) {
    this.day = day;
  }

  private int year;
  private int month;
  private int day;

  MyDate() {
    final GregorianCalendar calendar = new GregorianCalendar();
    year = calendar.get(GregorianCalendar.YEAR);
    month = calendar.get(GregorianCalendar.MONTH);
    day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
  }

  MyDate(final long elapsedTime){
    setDate(elapsedTime);
  }

  MyDate(final int year, final int month, final int day) {

  }

  
/*
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
*/
}