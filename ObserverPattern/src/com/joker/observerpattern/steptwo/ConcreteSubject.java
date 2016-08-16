package com.joker.observerpattern.steptwo;

import java.util.Observable;

public class ConcreteSubject extends Observable {
  private String day;

  /**
   * @return the day
   */
  public String getDay() {
    return day;
  }

  /**
   * @param day the day to set
   */
  public void setDay(String day) {
    this.day = day;
    this.setChanged();
    this.notifyObservers(day);
  }

}
