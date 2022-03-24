package com.capg.iostreams;

import java.io.FileOutputStream;

public class Fileoutputs
{
  public static void main(String[] args) throws Exception
  {
	  FileOutputStream f=new FileOutputStream("abc.txt");
	  f.write(100);
	  f.close();
	  System.out.println("write operation done");
	  
  }
}
