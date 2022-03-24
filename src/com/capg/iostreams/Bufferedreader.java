package com.capg.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Bufferedreader
{
 public static void main(String[] args)throws Exception
 {
	 Reader fr=new FileReader("abc.txt");
	 BufferedReader br=new BufferedReader(fr);
	 String s=br.readLine();
	 while(s!=null)
	 {
		 System.out.println(s);
		 s=br.readLine();
	 }
	 
 }
}
//BufferedReaader reads the data line by line