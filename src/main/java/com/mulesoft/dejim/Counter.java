package com.mulesoft.dejim;

public class Counter {
	private int count = 0;
    public synchronized int count() {
       count++;
       return count;
    }
}
