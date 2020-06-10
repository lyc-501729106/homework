package com.company;


public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void announce();

    String getAction();

    void setAction(String action);
}
