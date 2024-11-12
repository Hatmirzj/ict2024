package com.ict.day2;
import java.awt.*;

public class AWTDemo1 extends Frame {
    public AWTDemo1(String title){
	super(title);
    }
    public static void main(String[] args){
	Frame f = new AWTDemo1("TestFrame");
	f.setSize(400,400);
	f.setLocation(100,100);
	f.show();
    }
}
