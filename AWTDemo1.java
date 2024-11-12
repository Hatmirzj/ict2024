package com.ict.day2;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class AWTDemo1 extends Frame 
{	JButton b1=new JButton("Submit");
	Button b2=new Button("Cancel");
	
	Label lbl = new Label("Who is your favorite movie star?");
	Choice ch = new Choice();
	
	
	Label lb2 = new Label("What's your hobby?");
	Checkbox cb1 = new Checkbox("Reading", true);
	Checkbox cb2 = new Checkbox("Music", true);
	Checkbox cb3 = new Checkbox("Painting", false);
	Checkbox cb4 = new Checkbox("Movies", false);
	Checkbox cb5 = new Checkbox("Dancing", false);

	public AWTDemo1(String title){
    	super(title);
    	setLayout(new FlowLayout());
    	ch.addItem("Amithab Bhachan");
		ch.addItem("Bobby Deol");
		ch.addItem("Sharukh Khan");
		ch.addItem("Hrithik Roshan");
		ch.addItem("Leonardo DiCaprio");
		
		add(lbl);
		add(ch);
		
		add(lb2);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(cb5);
		
		
    	add(b1);
    	add(b2);
    	setSize(500,500);
    	setVisible(true);
     }
    public static void main(String[] args){
	Frame f = new AWTDemo1(" ICT Java Training Window APP");
	  // f.setSize(400,400);
	 //  f.setLocation(100,100);
	  // f.setVisible(true);
	    //f.show();
	
	f.addWindowListener (
			new WindowAdapter () { 
			  public void windowClosing(WindowEvent e) { 
			      System.exit (0); 
			      }
			  }
			);
    }
}
