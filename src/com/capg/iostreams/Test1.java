package com.capg.iostreams;

import java.io.File;
import java.io.IOException;

public class Test1
{
 public static void main(String[] args) //throws Exception
 {
	 File f=new File("abc.txt");
	 try
	 {
	 f.createNewFile();
	 
	 }
	 catch(IOException e)
	 {
		 e.printStackTrace();
	 }
	 System.out.println(f.exists());
	 
 }
}
