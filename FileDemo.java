package com.ict;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream f=new FileInputStream("C:\\javaworkspace\\info.txt");
		FileOutputStream f1=new FileOutputStream("C:\\javaworkspace\\out.txt");
       int k;
       while((k=f.read())!=-1) {
    	   System.out.print((char)k);
    	   f1.write((char)k);
       }
       
       f.close();
       f1.close();
		
	}

}
