package com.capg.iostreams;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class Test4 
{
 public static void main(String[] args) throws Exception
 {
	 Writer fw=new FileWriter("abc.txt");
	 PrintWriter pw=new PrintWriter(fw);
	 //PrintWriter pw=new PrintWriter("abc.txt");
	 pw.println("abc");
	 pw.println(100);
	 pw.println("hr");
	 pw.close();
	 System.out.println("write operation done");
 }
}
